package com.lrn.dw.pattern.state;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/23 4:32 PM
 * @Version 1.0
 */
public class StoppingState extends LiftState {

    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了。。。");
    }
}
