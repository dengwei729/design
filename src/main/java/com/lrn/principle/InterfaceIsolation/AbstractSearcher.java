package com.lrn.principle.InterfaceIsolation;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/23 10:35 AM
 * @Version 1.0
 */
public abstract class AbstractSearcher {
    protected IPettyGirl pettyGirl;
    public AbstractSearcher(IPettyGirl pettyGirl) {
        this.pettyGirl = pettyGirl;
    }

    // 搜索没有，列出美女
    public abstract void show();
}
