package com.example.oembed.codingTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Number07Test {
    Number07 number07 = new Number07();
    @Test
    void findFriends() {
        assertThat(number07.findFriends(new String[]{"Ryan", "Kieran", "Mark"})).isEqualTo(new String[]{"Ryan", "Mark"});
    }
}