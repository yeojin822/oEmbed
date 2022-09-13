package com.example.oembed.codingTest;

/**
 * 선택 테스트 - 1. 모음 찾기
 */
public class Number05 {
    public int vowels(String str){
        return str.length() - str.replaceAll("(?i)[aeiou]", "").length();
    }
}
