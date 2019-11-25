package com.lrn.pattern.strategy;

/**
 * 锦囊
 * Created by dengwei on 16/11/6.
 */
public class Context {
    private IStrategy strategy;
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
