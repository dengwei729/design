package com.lrn.pattern.abstractfactory;


/**
 * Created by dengwei on 16/11/6.
 */
public class FemaleFactory implements HumanFactory {
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
}
