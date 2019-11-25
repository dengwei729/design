package com.lrn.pattern.factorymethod;

/**
 * Created by dengwei on 16/11/6.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);

    public abstract Human createHuman();
}
