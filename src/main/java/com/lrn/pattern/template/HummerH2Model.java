package com.lrn.pattern.template;

/**
 * Created by dengwei on 16/11/6.
 */
public class HummerH2Model extends HummerModel {
    public void start() {
        System.out.println("悍马H2发动...");
    }

    public void stop() {
        System.out.println("悍马H2停车...");
    }

    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样在...");
    }
}
