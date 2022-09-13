package com.example.oembed.codingTest;

import java.util.Arrays;

/**
 * 필수 테스트 - 2. 사용하지 않는 가장 작은 숫자 찾기
 * */
public class Number02 {
    public int minNum(int[] ids) {
        Arrays.sort(ids);
        int[] array = Arrays.stream(ids).distinct().toArray();
        int answer = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i ) {
                return i ;
            }
        }
        return answer ;
    }
}
