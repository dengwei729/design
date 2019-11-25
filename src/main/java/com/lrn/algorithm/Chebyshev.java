package com.lrn.algorithm;

/**
 * @Decription 切比雪夫距离
 * @Author dengwei
 * @Date 2019/11/25 9:41 PM
 * @Version 1.0
 */
public class Chebyshev {
    public static void main(String[] args) {
        double distance = 0;
        double[] vector1= {1,2,3};
        double[] vector2= {4,5,7};

        if (vector1.length == vector2.length) {
            for (int i = 0; i < vector1.length; i++) {
                double temp = Math.abs(vector1[i] - vector2[i]);
                if (temp>distance) {
                    distance = temp;
                }
            }
        }
        System.out.println(distance);
    }
}
