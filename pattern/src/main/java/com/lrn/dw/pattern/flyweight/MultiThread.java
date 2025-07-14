package com.lrn.dw.pattern.flyweight;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/24 11:03 PM
 * @Version 1.0
 */
public class MultiThread extends Thread {
    private  SignInfo signInfo;

    public MultiThread(SignInfo signInfo) {
        this.signInfo = signInfo;
    }

    public void run() {
        if (!signInfo.getId().equals(signInfo.getLocation())) {
            System.out.println("编号：" + signInfo.getId());
            System.out.println("考试地址：" + signInfo.getLocation());
            System.out.println("线程不安全了");
            return;
        }
    }
}
