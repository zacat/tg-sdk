package com.zoeyun.tgsdk.utils;


import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5不可逆加密工具类
 */
public class Md5Utils {

    private static final String MD5 = "MD5";
    private static final String DEFAULT_ENCODING = "UTF-8";

    /**
     * 对输入字符串进行md5散列.
     *
     * @param content 加密字符串
     */
    public static String md5(String content) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MD5);
            messageDigest.update(content.getBytes(DEFAULT_ENCODING));
            byte[] result = messageDigest.digest();
            return new String(Hex.encodeHex(result));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String byte2Hex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(b & 0xFF);
            if (hex.length() == 1) {
                hex = "0" + hex;   // one byte to double-digit hex
            }
            sb.append(hex);
        }
        return sb.toString();
    }


}
