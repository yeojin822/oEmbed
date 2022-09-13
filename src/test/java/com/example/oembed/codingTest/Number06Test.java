package com.example.oembed.codingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Number06Test {
    Number06 number06 = new Number06();
    @Test
    void midNumber() {
        assertThat(number06.midNumber(new int[]{0,1,2})).isEqualTo(1);
        assertThat(number06.midNumber(new int[]{5,1,2})).isEqualTo(2);
    }
}