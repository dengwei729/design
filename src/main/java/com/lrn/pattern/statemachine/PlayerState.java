package com.lrn.pattern.statemachine;

/**
 * Created by dengwei on 09/08/2017.
 */
public abstract class PlayerState {

    public final static int PLAY_OR_PAUSE=0;
    public  final static int STOP = 1;
    protected IPlayer mPlayer;

    public PlayerState(IPlayer player) {
        this.mPlayer = player;
    }

    public abstract void  handle(int action);

    public String toString() {
        return "current state:" +this.getClass().getSimpleName();
    }
}
