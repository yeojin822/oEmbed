package com.example.oembed.codingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Number02Test {
    Number02 number02 = new Number02();
    @Test
    void minNum() {
        assertThat(number02.minNum(new int[]{0,1,2,4})).isEqualTo(3);
        assertThat(number02.minNum(new int[]{0,1,2,3,4,5,6})).isEqualTo(7);
        assertThat(number02.minNum(new int[]{0,1,2,3,3,4,5,6})).isEqualTo(7);
    }
}