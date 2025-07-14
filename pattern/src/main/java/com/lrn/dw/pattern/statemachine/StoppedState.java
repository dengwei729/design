package com.lrn.dw.pattern.statemachine;

/**
 * Created by dengwei on 09/08/2017.
 */
public class StoppedState extends PlayerState {
    public StoppedState(IPlayer player) {
        super(player);
    }

    public void handle(int action) {
        switch (action) {
            case PLAY_OR_PAUSE:
                mPlayer.playVedio();
                mPlayer.setState(new PlayingState(mPlayer));
                break;
            default:
                throw new IllegalArgumentException("ERROE ACTION:"+action+",current state:"+this.getClass().getSimpleName());
        }
    }
}
