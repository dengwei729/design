package com.lrn.test.polymorphic;

/**
 * @author dengwei
 * @since 2020/8/25.
 */
public class B extends A {
    public String show(B obj){
        return ("B and B");
    }

    public String show(A obj){
        return ("B and A");
    }
}
