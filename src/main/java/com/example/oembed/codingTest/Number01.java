package com.example.oembed.codingTest;

/**
 * 필수 테스트 - 1. 분기 숫자 구하기
 * */
public class Number01 {
    public int quarter(int month){
        if(month > 12 || month < 1){
            return 0;
        }
        return (int)(Math.ceil((double)month/3));
    }
}
