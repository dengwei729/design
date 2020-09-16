package com.lrn.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author dengwei
 * @since 2020/9/16.
 */
public class MapTest {
    public static void main(String[] args) {

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("test1", "test1");
        map1.put("test2", "test2");
        map1.put("test3", "test3");
        map1.put("test4", "test4");
System.out.println(map1.values());


        Map<String, String> map2 = new LinkedHashMap<String, String>();
        map2.put("test1", "test1");
        map2.put("test2", "test2");
        map2.put("test3", "test3");
        map2.put("test4", "test4");
        System.out.println(map2.values());
    }
}
