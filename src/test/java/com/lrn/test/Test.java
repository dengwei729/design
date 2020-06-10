package com.lrn.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/23 10:14 AM
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        //List<String> list = new ArrayList<String>();
        ////list.add("a");
        ////list.add("c");
        ////list.add("b");
        //Collections.reverse(list);
        //
        //List<String> l2 ;
        //if (list.size() >= 3) {
        //    l2 = list.subList(0,3);
        //    System.out.println(l2);
        //}
        //
        //System.out.println(list);
        //list = list.subList(list.size()-2,list.size());
        //System.out.println(list);
        //
        //int a = 8;
        //System.out.println(a/3);
        //
        //Map<String, String> map = new HashMap<String, String>();
        //map.put("test", "1");
        //map.put("test", "2");
        //System.out.println(map);
        //System.out.println(map.get("ab"));
        //
        //String test = "test$test1$test2";
        //String[] testL = test.split("\\$");
        //System.out.println(testL);

        List<Integer> listI = new ArrayList<>();
        //listI.add(0);
        //listI.add(0);
        //listI.add(0);
        //listI.add(0);
        //listI.add(0);
        //listI.add(765);
        //listI.add(813);
        //listI.add(856);
        //listI.add(740);
        //listI.add(667);
        //listI.add(801);
        //listI.add(739);
        //listI.add(710);
        //listI.add(751);
        //listI.add(793);
        //listI.add(1793);
        //listI.add(1393);
        //listI.add(1593);
        //listI.add(1593);
        //listI.add(1493);
        //listI.add(805);

        listI.add(1508);
        listI.add(186);
        listI.add(136);
        listI.add(142);
        listI.add(2301);
        listI.add(2225);
        listI.add(1846);
        listI.add(992);
        listI.add(1858);
        listI.add(2944);

        for (int i=0; i<listI.size(); i++) {
            if (i>=5) {
                int sum = 0;
                for (int index: listI.subList(i-5, i)) {
                    //System.out.println(i + " - " +index);
                    sum += index;
                }
                int ave = sum/5;
                System.out.println(String.format("当前分钟值：%s， 5分钟均线:%s, 上涨比例：%s，绝对值：%s", listI.get(i), ave, (listI.get(i)-ave)*1.0/ave*1.0*100, listI.get(i)-ave));
            }
        }

    }
}
