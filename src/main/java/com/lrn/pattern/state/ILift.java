package com.lrn.pattern.state;

/**
 * @Decription 电梯接口
 * @Author dengwei
 * @Date 2019/11/23 4:16 PM
 * @Version 1.0
 */
public interface ILift {
    
    public final static int OPENING_STATE=1;
    public final static int CLOSING_STATE=2;
    public final static int RUNNINT_STATE=3;
    public final static int STOPPING_STATE=4;

    public void setState(int state);

    public void open();
    public void close();
    public void run();
    public void stop();
}
