package com.lrn.test.polymorphic;

/**
 * @author dengwei
 * @since 2020/8/25.
 */
public class A {
    public String show(D obj) {
        return ("A and D");
    }

    public String show(A obj) {
        return ("A and A");
    }
}
