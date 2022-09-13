package com.example.oembed.codingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Number04Test {
    Number04 number04 = new Number04();
    @Test
    void plusMinus() {
        assertThat(number04.plusMinus(10)).isEqualTo("apple");
        assertThat(number04.plusMinus(325)).isEqualTo("apple");
        assertThat(number04.plusMinus(306)).isEqualTo("apple");
    }
}