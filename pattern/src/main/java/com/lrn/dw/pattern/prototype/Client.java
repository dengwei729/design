package com.lrn.dw.pattern.prototype;

import java.util.Random;

/**
 * Created by dengwei on 16/11/5.
 */
public class Client {
    // 发送账单数量,这个值是从数据库中获得
    private static int MAX_COUNT = 50;
    public static void main(String[] args) {
        int i=0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");

        while (i<MAX_COUNT) {
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5)+ "先生(女士)");
            sendMail(cloneMail);
            i++;
        }
    }

    public static void sendMail(Mail mail) {
        System.out.println("标题:"+mail.getSubject() + "\t收件人:" + mail.getAppellation() + "\t...发送成功!");
    }

    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i=0; i<maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
