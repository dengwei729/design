package com.lrn.pattern.bridge;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/24 11:28 PM
 * @Version 1.0
 */
public class House extends Product {
    public void beProduced() {
        System.out.println("生产出的房子是这样子的。。。");
    }

    public void beSelled() {
        System.out.println("生产出的房子卖出去了。。。");
    }
}
