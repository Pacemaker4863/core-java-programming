package com.exostaz.fundamental.primitive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegersTest {
    Integers integers;

    @BeforeEach
    void setUp() {
        integers = new Integers();
    }

    @Test
    void playWithInt() {
        Integers.playWithInt();
    }
}
