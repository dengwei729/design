package com.lrn.test.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengwei
 * @since 2020/11/20.
 */
public class Test {

    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add("test");
        List<String> b = new ArrayList<String>();
        b.add("test");
        b.add("test1");

        System.out.println(a.equals(b));
    }
}
