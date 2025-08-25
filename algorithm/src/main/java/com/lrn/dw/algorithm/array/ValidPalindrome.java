package com.lrn.dw.algorithm.array;

/**
 * 题目描述：可以删除一个字符，判断是否能构成回文字符串。
 * <p>
 * 所谓的回文字符串，是指具有左右对称特点的字符串，例如 "abcba" 就是一个回文字符串。
 *
 * @author  dw113073.邓伟
 * @since 2025/8/25 15:46
 * @date 2025/08/25
 */
public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            char source = s.charAt(i);
            char target = s.charAt(j);
            if (source != target) {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            char source = s.charAt(i++);
            char target = s.charAt(j--);
            if (source != target) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.validPalindrome("abcdaba"));
    }
}
