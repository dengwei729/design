package com.lrn.pattern.template;

/**
 * Created by dengwei on 16/11/6.
 */
public abstract class HummerModel {

    public abstract void start();
    public abstract void stop();
    public abstract void alarm();
    public abstract void engineBoom();
    public void run() {
        this.start();
        this.engineBoom();
        if (isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    // 钩子方法,默认喇叭是会响的
    protected boolean isAlarm() {
        return true;
    }
}
