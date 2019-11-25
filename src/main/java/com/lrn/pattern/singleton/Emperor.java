package com.lrn.pattern.singleton;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dengwei on 16/11/5.
 */
public class Emperor {

    // 定义最多能产生的实例数量
    private static  int maxNumOfEmperor = 2;
    // 每个皇帝有名字
    private static ArrayList<String> nameList = new ArrayList<String>();

    private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();

    // 当前皇帝序列号
    private static int countNumOfEmperor=0;

    //产出所有的对象
    static {
        for (int i=0; i<maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇"+(i+1)+"帝"));
        }
    }
    private Emperor() {
        // 世俗和道德约束你,目的就是不产生第二个皇帝
    }

    public Emperor(String name) {
        nameList.add(name);
    }

    public static Emperor getInstance() {
        Random random = new Random();

        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    public static void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }
}
