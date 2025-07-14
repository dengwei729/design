package com.lrn.dw.pattern.factorymethod;

/**
 * Created by dengwei on 16/11/6.
 */
public class WhiteHumanFactory extends AbstractHumanFactory {
    public <T extends Human> T createHuman(Class<T> c) {
        return null;
    }

    public Human createHuman() {
        return new WhiteHuman();
    }
}
