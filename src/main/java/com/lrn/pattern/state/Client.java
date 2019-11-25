package com.lrn.pattern.state;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/23 4:19 PM
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.setState(ILift.STOPPING_STATE);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();

        // 优秀模式
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.close();
        context.open();
        context.stop();
    }
}
