package com.lrn.pattern.state;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/23 4:17 PM
 * @Version 1.0
 */
public class Lift implements ILift {

    private int state;
    public void setState(int state) {
        this.state=state;
    }

    public void open() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.closeWithoutLoLogic();
                this.setState(OPENING_STATE);
                break;
            case RUNNINT_STATE:
                break;
            case STOPPING_STATE:
                this.closeWithoutLoLogic();
                this.setState(OPENING_STATE);
                break;
        }
    }

    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                this.openWithoutLoLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                break;
            case RUNNINT_STATE:
                break;
            case STOPPING_STATE:
                break;
        }
    }

    public void run() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.runWithoutLoLogic();
                this.setState(RUNNINT_STATE);
                break;
            case RUNNINT_STATE:
                break;
            case STOPPING_STATE:
                this.runWithoutLoLogic();
                this.setState(RUNNINT_STATE);
                break;
        }
    }

    public void stop() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.stopWithoutLoLogic();
                this.setState(STOPPING_STATE);
                break;
            case RUNNINT_STATE:
                this.stopWithoutLoLogic();
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                break;
        }
    }

    public void openWithoutLoLogic() {
        System.out.println("电梯门开始。。。");
    }

    public void closeWithoutLoLogic() {
        System.out.println("电梯门关闭。。。");
    }

    public void runWithoutLoLogic() {
        System.out.println("电梯上下运行起来。。。");
    }

    public void stopWithoutLoLogic() {
        System.out.println("电梯停止了。。。");
    }
}
