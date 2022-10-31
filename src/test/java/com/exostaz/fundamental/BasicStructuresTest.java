package com.exostaz.fundamental;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicStructuresTest {
    BasicStructures basicStructures;

    @BeforeEach
    void setUp() {
        basicStructures = new BasicStructures();
    }

    @Test
    void playWithInt() {
        basicStructures.playWithInt();
    }
}
