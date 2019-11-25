package com.lrn.principle.InternalSubstitution;

/**
 * AUG狙击枪
 */
public class AUG extends Rifle {

    //狙击枪都携带了一个精准的望远镜
    public void zoomOut() {
        System.out.println("通过望远镜观察敌人。。。");
    }

    public void shoot() {
        System.out.println("AUG 射击。。。");
    }
}

