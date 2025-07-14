package com.lrn.dw.pattern.factorymethod;

/**
 * Created by dengwei on 16/11/6.
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        return null;
    }
}
