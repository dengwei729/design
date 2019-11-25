package com.lrn.principle.InternalSubstitution;

public class Soldier {

    private AbstractGun gun;

    public AbstractGun getGun() {
        return gun;
    }

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy() {
        System.out.println("士兵开始杀敌人。。。");
        gun.shoot();
    }
}
