package com.example.oembed.codingTest;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 선택 테스트 - 4. 아이큐 테스트
 */
public class Number08 {
    public int iqTest(String num){
        String[] array = num.split(" ");
        ArrayList<String> list = new ArrayList<>();
        int zeroCnt = 0;
        int oneCnt = 0;

        for (int i = 0; i < array.length; i++) {
            if(Integer.parseInt(array[i]) % 2 == 0){
                list.add("0");
                zeroCnt++;
            }else{
                list.add("1");
                oneCnt++;
            }
        }

       if(zeroCnt > oneCnt){
           return list.indexOf("1")+1;
       }else{
           return list.indexOf("0")+1;
       }

    }
}
