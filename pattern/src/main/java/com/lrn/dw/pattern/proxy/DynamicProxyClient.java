package com.lrn.dw.pattern.proxy;


import java.lang.reflect.InvocationHandler;

/**
 * Created by dengwei on 16/11/5.
 */
public class DynamicProxyClient {

    public  static void main(String[] args) {
        Subject subject = new RealSubject();

        InvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        proxy.doSomething("Finish");
    }
}
