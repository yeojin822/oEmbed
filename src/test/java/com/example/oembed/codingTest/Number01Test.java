package com.example.oembed.codingTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class Number01Test {
    Number01 number01 = new Number01();

    @Test
    void q() {
        assertThat(number01.quarter(1)).isEqualTo(1);
        assertThat(number01.quarter(2)).isEqualTo(1);
        assertThat(number01.quarter(3)).isEqualTo(1);
        assertThat(number01.quarter(4)).isEqualTo(2);
        assertThat(number01.quarter(5)).isEqualTo(2);
        assertThat(number01.quarter(6)).isEqualTo(2);
        assertThat(number01.quarter(7)).isEqualTo(3);
        assertThat(number01.quarter(8)).isEqualTo(3);
        assertThat(number01.quarter(9)).isEqualTo(3);
        assertThat(number01.quarter(10)).isEqualTo(4);
        assertThat(number01.quarter(11)).isEqualTo(4);
        assertThat(number01.quarter(12)).isEqualTo(4);

    }
}
