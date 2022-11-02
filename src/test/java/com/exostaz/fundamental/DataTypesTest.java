package com.exostaz.fundamental;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataTypesTest {
    DataTypes dataTypes;

    @BeforeEach
    void setUp() {
        dataTypes = new DataTypes();
    }

    @Test
    void playWithInt() {
        dataTypes.playWithInt();
    }
}
