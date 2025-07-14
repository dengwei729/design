package com.lrn.dw.pattern.bridge;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/24 11:28 PM
 * @Version 1.0
 */
public class IPod extends Product {
    public void beProduced() {
        System.out.println("生产出的IPod是这样子的。。。");
    }

    public void beSelled() {
        System.out.println("生产出的IPod卖出去了。。。");
    }
}
