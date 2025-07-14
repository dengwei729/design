package com.lrn.dw.pattern.proxy;

/**
 * Created by dengwei on 16/11/5.
 */
public class BeforeAdvice implements IAdvice {
    public void exec() {
        System.out.println("我是前置通知,我被执行了");
    }
}
