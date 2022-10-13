package com.zoeyun.tgsdk.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SignUtils {


    public static String getSign(Map<String, Object> inMap, String signKey) {
        Map<String, Object> treeMap = new TreeMap(inMap);
        treeMap.remove("sign");
        String value = getCheckValue(treeMap);
        if (StringUtils.isEmpty(value)) {
            value = "key=" + signKey;
        } else {
            value = value + "&key=" + signKey;
        }
        String signCalc = Md5Utils.md5(value);
        return signCalc.toUpperCase();
    }

    public static String getCheckValue(Map<String, Object> inMap) {
        String value = "";
        for (String str : inMap.keySet()) {
            Object keyValue = inMap.get(str);
            if (keyValue != null && StringUtils.isNotBlank(keyValue.toString())) {
                value = value + String.format("%s=%s&", str, keyValue);
            }
        }
        if (value.endsWith("&")) {
            value = value.substring(0, value.length() - 1);
        }
        return value;
    }

    public static boolean checkSign(Map<String, Object> inMap, String signKey) {
        Map<String, Object> treeMap = new TreeMap(inMap);
        String sign = (String) treeMap.get("sign");
        treeMap.remove("sign");
        String value = getCheckValue(treeMap);
        if (StringUtils.isEmpty(value)) {
            value = "key=" + signKey;
        } else {
            value = value + "&key=" + signKey;
        }
        String signCalc = Md5Utils.md5(value).toUpperCase();
        return signCalc.equals(sign);
    }

}
