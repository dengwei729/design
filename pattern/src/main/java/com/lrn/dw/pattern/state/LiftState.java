package com.lrn.dw.pattern.state;

/**
 * @Decription 抽象电梯状态
 * @Author dengwei
 * @Date 2019/11/23 4:29 PM
 * @Version 1.0
 */
public abstract class LiftState {
    // 定义一个环境角色，也就是封装状态的变化引起的功能变化
    protected Context context;
    public void setContext(Context context){
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();
}
