package com.example.oembed.codingTest;

/**
 *
 */
public class Number03 {
    public int score(String[] games){
        int sum = 0;

        if(games.length > 10){
            System.out.println("최대 10개 경기 점수만 입력 가능합니다.");
            return 0;
        }

        for (int i = 0; i < games.length; i++) {
            int a = Integer.parseInt( games[i].split(":")[0]);
            int b = Integer.parseInt( games[i].split(":")[1]);
            if(a > b){
                sum += 3;
            }else if (a == b){
                sum += 1;
            }
        }
        return sum;
    }
}
