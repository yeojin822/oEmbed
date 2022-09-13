package com.example.oembed.codingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Number05Test {
    Number05 number05 = new Number05();
    @Test
    void vowels() {
        assertThat(number05.vowels("abracadabra")).isEqualTo(5);
        assertThat(number05.vowels("avvevivovu")).isEqualTo(5);
    }
}