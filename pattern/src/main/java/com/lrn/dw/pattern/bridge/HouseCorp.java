package com.lrn.dw.pattern.bridge;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/24 11:31 PM
 * @Version 1.0
 */
public class HouseCorp extends Corp {
    public HouseCorp(Product product) {
        super(product);
    }

    @Override
    protected void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司转大钱了");
    }
}
