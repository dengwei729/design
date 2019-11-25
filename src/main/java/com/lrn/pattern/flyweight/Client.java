package com.lrn.pattern.flyweight;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/24 10:52 PM
 * @Version 1.0
 */
public class Client {
    public static void main(String [] args) {
//        for (int i=0; i<4; i++) {
//            String subject = "科目" + i;
//            for (int j=0; j<30; j++) {
//                String key = subject + "考试地点" + j;
//                SignInfoFactory.getSignInfo(key);
//            }
//        }
//        SignInfo signInfo = SignInfoFactory.getSignInfo("科目1考试地点1");

        SignInfoFactory.getSignInfo("科目1");
        SignInfoFactory.getSignInfo("科目2");
        SignInfoFactory.getSignInfo("科目3");
        SignInfoFactory.getSignInfo("科目4");

        SignInfo signInfo = SignInfoFactory.getSignInfo("科目2");
        while (true) {
            signInfo.setId("ZhangSan");
            signInfo.setLocation("ZhangSan");
            new MultiThread(signInfo).start();
            signInfo.setId("LiSi");
            signInfo.setLocation("LiSi");
            new MultiThread(signInfo).start();
        }
    }
}
