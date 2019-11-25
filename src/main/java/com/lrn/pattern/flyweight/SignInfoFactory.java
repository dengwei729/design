package com.lrn.pattern.flyweight;

import java.util.HashMap;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/24 10:48 PM
 * @Version 1.0
 */
public class SignInfoFactory {
    private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            System.out.println(key + "---建立对象，并放置在池中。");
            result = new SignInfo();
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key + "---直接从池中取得");
        }
        return result;
    }
}
