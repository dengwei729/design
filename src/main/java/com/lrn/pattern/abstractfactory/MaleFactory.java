package com.lrn.pattern.abstractfactory;


/**
 * Created by dengwei on 16/11/6.
 */
public class MaleFactory implements HumanFactory {

    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
