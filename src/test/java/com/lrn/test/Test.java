package com.lrn.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/23 10:14 AM
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        List<String> l2 ;
        if (list.size() >= 3) {
            l2 = list.subList(0,3);
            System.out.println(l2);
        }

        System.out.println(list);
        list = list.subList(list.size()-2,list.size());
        System.out.println(list);

    }
}
