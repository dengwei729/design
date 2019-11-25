package com.lrn.pattern.builder;

/**
 * Created by dengwei on 16/11/6.
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车跑起来是这个样子的...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车应该这样停车...");

    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声是这个样子的...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎室是这个声音的...");
    }
}
