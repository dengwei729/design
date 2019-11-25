package com.lrn.pattern.factorymethod;

/**
 * Created by dengwei on 16/11/6.
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        return null;
    }

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
