package com.lrn.dw.pattern.proxy;


/**
 * Created by dengwei on 16/11/5.
 */
public class RealSubject implements Subject {

    public void doSomething(String str) {
        System.out.println("do something~ --- > " + str);
    }
}
