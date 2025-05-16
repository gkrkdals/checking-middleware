package com.checking.middleware.services;

import com.checking.middleware.dto.response.BaseResponseDTO;
import com.checking.middleware.dto.response.ErrorResponseDTO;
import com.checking.middleware.enums.AllowedMethod;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.security.SecureRandom;

@Slf4j
public class Client {

    private static final String CALLER_NAME = "API_gcmsAmaranth38728";
    private static final String ACCESS_TOKEN = "JTUsjmi5t1bSqI9j6fTvrjNPAYMC3N";
    private static final String HASH_KEY = "13387775846281575639872204204271779602706412";
    private static final String GROUP_SEQ = "gcmsAmaranth38728";
    private static final WebClient WEB_CLIENT = WebClient.builder().baseUrl("https://erp.cherrybro.com").build();

    private static long getTimestamp() {
        return System.currentTimeMillis() / 1000;
    }

    private static String getTransactionId() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(32);
        for (int i = 0; i < 32; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

    private static String getWehagoSign(String uri, String transactionId, long timestamp) {
        return Hmac.hmac(HASH_KEY, ACCESS_TOKEN + transactionId + timestamp + uri);
    }

    public static <T> T webClientCall(String uri, AllowedMethod method, Object body, Class<T> responseType) throws Exception {
        long timestamp = getTimestamp();
        String transactionId = getTransactionId();
        String wehagoSign = getWehagoSign(uri, transactionId, timestamp);

        WebClient.RequestBodySpec request = WEB_CLIENT.method(method.getMethod())
                .uri(uri)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .header("callerName", CALLER_NAME)
                .header("transaction-id", transactionId)
                .header("timestamp", String.valueOf(timestamp))
                .header("Authorization", "Bearer " + ACCESS_TOKEN)
                .header("wehago-sign", wehagoSign)
                .header("groupSeq", GROUP_SEQ);

        try {
            if (method == AllowedMethod.POST || method == AllowedMethod.PUT) {
                return request
                        .bodyValue(body != null ? body : "{}")
                        .retrieve()
                        .bodyToMono(responseType)
                        .block();
            } else {
                return request
                        .retrieve()
                        .bodyToMono(responseType)
                        .block();
            }
        } catch (WebClientResponseException e) {
            System.out.println("❌ WebClient 호출 중 HTTP 오류 발생:");
            System.out.println("Status code: " + e.getStatusCode());
            System.out.println("Response body: " + e.getResponseBodyAsString());
            throw e;
        } catch (Exception e) {
            System.out.println("❌ WebClient 호출 중 예외 발생:");
            System.out.println("URI: " + uri);
            System.out.println("Method: " + method);
            System.out.println("Body: " + body);
            log.error("error", e);
            throw e;
        }
    }

    public static ResponseEntity<Object> client(String uri, AllowedMethod method, Object body) {
        try {
            BaseResponseDTO response = webClientCall(uri, method, body, BaseResponseDTO.class);
            return ResponseEntity.ok(response);
        } catch (WebClientResponseException e) {
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                ErrorResponseDTO errorDto = objectMapper.readValue(e.getResponseBodyAsString(), ErrorResponseDTO.class);
                return ResponseEntity.status(e.getStatusCode()).body(errorDto);
            } catch (Exception ex) {
                return ResponseEntity.status(e.getStatusCode()).body(e.getResponseBodyAsString());
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }
}
