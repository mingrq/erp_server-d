package com.ming.utils.Encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static String getMD5String(String str) {
        try {
            MessageDigest digest = MessageDigest.getInstance("md5");
            //digest.

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
return null;
    }
}
