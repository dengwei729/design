package com.lrn.dw.pattern.statemachine;

/**
 * Created by dengwei on 09/08/2017.
 */
public class VedioPlayer extends  IPlayer {

    private PlayerState mState = new StoppedState(this);

    public void request(int action) {
        System.out.println("before action:" + mState.toString());
        mState.handle(action);
        System.out.println("after action:" + mState.toString());
    }

    public void setState(PlayerState state) {
        this.mState = state;
    }

    public void playVedio() {
        System.out.println("play vedio!");
    }

    public void pause() {
        System.out.println("pause vedio!");
    }

    public void stop() {
        System.out.println("stop vedio!");
    }

    public void showAD() {
        System.out.println("show AD!");
    }
}
