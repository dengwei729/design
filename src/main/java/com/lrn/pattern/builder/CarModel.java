package com.lrn.pattern.builder;

import java.util.ArrayList;

/**
 * Created by dengwei on 16/11/6.
 */
public abstract class CarModel {
    // 这个参数是各个基本方法执行的顺序
    private ArrayList<String > sequence = new ArrayList<String>();

    // 魔心是启动开始跑了
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    // 那模型应该会跑了
    final public void run() {
        for (int i=0; i<this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom();
            }
        }
    }

    // 把传递过来的值传递到类内
    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

}
