package com.lrn.dw.pattern.bridge;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/24 11:33 PM
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        House house = new House();
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();

        ShanZaiCorp shanZaiCorp = new ShanZaiCorp(new IPod());
        shanZaiCorp.makeMoney();

    }
}
