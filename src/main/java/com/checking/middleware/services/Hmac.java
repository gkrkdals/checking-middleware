package com.checking.middleware.services;

import jakarta.xml.bind.DatatypeConverter;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

public class Hmac {

    public static String hmac(String key, String value)  {
        try {
            SecretKeySpec keySpec =new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
            Mac mac =Mac.getInstance("HmacSHA256");
            mac.init(keySpec);
            byte[] encrypted =mac.doFinal(value.getBytes(StandardCharsets.UTF_8));
            return DatatypeConverter.printBase64Binary(encrypted);
        }
        catch(Exception e) {
            System.out.println("AuthCallUtil.hmac-Error : "+e);
            e.printStackTrace();
        }
        return null;
    }
}
