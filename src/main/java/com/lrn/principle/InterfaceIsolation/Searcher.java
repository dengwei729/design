package com.lrn.principle.InterfaceIsolation;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/23 10:37 AM
 * @Version 1.0
 */
public class Searcher extends AbstractSearcher {
    public Searcher(IPettyGirl pettyGirl) {
        super(pettyGirl);
    }

    @Override
    public void show() {
        System.out.println("美女信息如下：");
        super.pettyGirl.goodLooking();
        super.pettyGirl.nixPigure();
        super.pettyGirl.greatTemperament();
    }
}
