package com.lrn.pattern.bridge;

/**
 * @Decription 抽象公司
 * @Author dengwei
 * @Date 2019/11/24 11:23 PM
 * @Version 1.0
 */
public abstract class Corp {

    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    /**
     * 赚钱
     */
    protected void makeMoney() {
        this.product.beProduced();
        this.product.beSelled();
    }
}
