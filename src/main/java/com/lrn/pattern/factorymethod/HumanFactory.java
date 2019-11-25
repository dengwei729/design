package com.lrn.pattern.factorymethod;

/**
 * Created by dengwei on 16/11/6.
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human)Class.forName(c.getName()).newInstance();
        } catch (Exception e ) {
            System.out.println("人类生成错误!");
        }
        return (T)human;
    }

    @Override
    public Human createHuman() {
        return null;
    }
}
