package com.keington.utils;

import java.security.MessageDigest;

/**
 * @author Xu.Huaian
 * @date 2022/5/25
 */

public class Md5Utils {

    private static final String[] hexDigIts = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};

    /**
     * MD5加密
     * @param origin 字符
     * @param charsetname 编码
     */
    public static String MD5Encode(String origin, String charsetname){
        String resultString = null;
        try{
            resultString = origin;
            MessageDigest md = MessageDigest.getInstance("MD5");
            if(null == charsetname || "".equals(charsetname)){
                resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
            }else{
                resultString = byteArrayToHexString(md.digest(resultString.getBytes(charsetname)));
            }
        }
        catch (Exception ignored){
        }
        return resultString;
    }


    public static String byteArrayToHexString(byte[] b){
        StringBuilder resultSb = new StringBuilder();
        for (byte value : b) {
            resultSb.append(byteToHexString(value));
        }
        return resultSb.toString();
    }

    public static String byteToHexString(byte b){
        int n = b;
        if(n < 0){
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigIts[d1] + hexDigIts[d2];
    }

    public static void main(String[] args) {
        String password = "admin";
        String md5Encode = MD5Encode(password,"utf8");
        System.out.println(md5Encode);
    }
}
