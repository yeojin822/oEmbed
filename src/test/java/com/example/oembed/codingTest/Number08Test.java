package com.example.oembed.codingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Number08Test {
    Number08 number08 = new Number08();
    @Test
    void iqTest() {
        assertThat(number08.iqTest("2 4 7 8 10")).isEqualTo(3);
        assertThat(number08.iqTest("1 2 1 1")).isEqualTo(2);
    }
}