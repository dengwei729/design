package com.lrn.dw.pattern.abstractfactory;

/**
 * Created by dengwei on 16/11/6.
 */
public abstract class AbstractWhiteHuman implements Human {
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的...");
    }

    public void talk() {
        System.out.println("白色人种会说话,一般都是单字节...");
    }
}
