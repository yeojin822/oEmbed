package com.example.oembed.codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 선택 테스트 - 3. 친구 찾기
 */
public class Number07 {
    public String[] findFriends(String[] friends){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < friends.length; i++) {
            if(friends[i].length() == 4){
                list.add(friends[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}
