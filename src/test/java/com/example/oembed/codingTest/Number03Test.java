package com.example.oembed.codingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Number03Test {
    Number03 number03 = new Number03();
    @Test
    void score() {
        assertThat(number03.score(new String[]{"3:1", "2:2", "1:3"})).isEqualTo(4);
    }
}
