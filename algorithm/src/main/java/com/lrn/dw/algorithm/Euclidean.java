package com.lrn.dw.algorithm;

/**
 * @Decription 欧几里得度量算法
 * @Author dengwei
 * @Date 2019/11/25 9:25 PM
 * @Version 1.0
 */
public class Euclidean {
    public static void main(String[] args) {
        double distance = 0;
        double[] vector1= {1.1,1.2};
        double[] vector2= {2.2,1.2};

        if (vector1.length == vector2.length) {
            for (int i = 0; i < vector1.length; i++) {
                double temp = Math.pow((vector1[i] - vector2[i]), 2);
                distance += temp;
           }
           distance = Math.sqrt(distance);
        }
        System.out.println(distance);
    }
}
