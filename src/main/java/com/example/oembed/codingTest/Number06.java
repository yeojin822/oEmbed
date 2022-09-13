package com.example.oembed.codingTest;

import org.thymeleaf.util.ArrayUtils;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 선택 테스트 - 2. 중간 숫자 찾기
 */
public class Number06 {
    public int midNumber(int[] in){
        int[] temp = in.clone();
        Arrays.sort(temp);
        int i = 0;
        while (i < in.length){
            if(in[i] == temp[1]){
                break;
            }
            i++;
        }
        return i;
    }
}
