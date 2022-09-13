package com.example.oembed.codingTest;

/**
 * 필수 테스트 - 1. 모음 찾기
 */
public class Number04 {
    private static String[] FRUITES = {
            "",
            "kiwi",
            "pear",
            "kiwi",
            "banana",
            "melon",
            "banana",
            "melon",
            "pineapple",
            "apple",
            "pineapple"};

    public String plusMinus(int n) {
        String str = ""+n;

        while (str.length() > 1) {
            int sum = 0;
            int num = Integer.parseInt(str);
            while (num != 0) {
                sum += (num % 10);
                num /= 10;
            }
            str = String.valueOf(Integer.parseInt(str) - sum);
        }
        return FRUITES[Integer.parseInt(str)];
    }
}
