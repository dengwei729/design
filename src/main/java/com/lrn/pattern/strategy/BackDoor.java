package com.lrn.pattern.strategy;

/**
 * 乔国老走后门
 * Created by dengwei on 16/11/6.
 */
public class BackDoor implements IStrategy {
    public void operate() {
        System.out.println("找乔国老帮忙,让吴国太给孙权施加压力..");
    }
}
