package com.lrn.principle.InterfaceIsolation;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/23 10:33 AM
 * @Version 1.0
 */
public class PettyGirl implements IPettyGirl {

    private String name;

    public PettyGirl(String name) {
        this.name = name;
    }

    public void goodLooking() {
        System.out.println(this.name + "----脸蛋很漂亮！");

    }

    public void nixPigure() {
        System.out.println(this.name + "----身材非常棒！");
    }

    public void greatTemperament() {
        System.out.println(this.name + "----气质非常好！");
    }
}
