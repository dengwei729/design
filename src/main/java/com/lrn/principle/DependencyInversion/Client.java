package com.lrn.principle.DependencyInversion;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/22 10:56 PM
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        IDriver zhangSan = new Driver();
        ICar benz = new Benz();
        zhangSan.driver(benz);

        ICar bmw = new BMW();
        zhangSan.driver(bmw);
    }
}
