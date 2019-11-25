package com.lrn.principle.InternalSubstitution;

public class Client {

    public static void main(String[] args) {
        Soldier sanMao = new Soldier();
        sanMao.setGun(new ToyGun());
        sanMao.killEnemy();

        Snipper snipper = new Snipper();
        snipper.killEnemy(new AUG());
    }
}
