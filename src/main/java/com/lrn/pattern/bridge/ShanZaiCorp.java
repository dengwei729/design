package com.lrn.pattern.bridge;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/24 11:31 PM
 * @Version 1.0
 */
public class ShanZaiCorp extends Corp {
    public ShanZaiCorp(Product product) {
        super(product);
    }

    @Override
    protected void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀。。。");
    }
}
