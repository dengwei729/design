package com.lrn.dw.algorithm.array;

/**
 * 题目描述：判断一个非负整数是否为两个整数的平方和。
 * <p>
 * 可以看成是在元素为 0~target 的有序数组中查找两个数，使得这两个数的平方和为 target，如果能找到，则返回 true，表示 target 是两个整数的平方和。
 *
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 *
 * @author  dw113073.邓伟
 * @since 2025/8/25 15:42
 * @date 2025/08/25
 */
public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int target) {
        if (target < 0) return false;
        int i = 0, j = (int) Math.sqrt(target);
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == target) {
                return true;
            } else if (powSum > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        SumOfSquareNumbers sumOfSquareNumbers = new SumOfSquareNumbers();
        System.out.println(sumOfSquareNumbers.judgeSquareSum(10));
    }

}

