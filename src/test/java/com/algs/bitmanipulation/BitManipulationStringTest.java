package com.algs.bitmanipulation;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class BitManipulationStringTest {

    private BitManipulationString bitManipulationString;

    @Before
    public void setup() {
        bitManipulationString = new BitManipulationString();
    }

    @Test
    public void test_countOneBits() {
        assertThat(bitManipulationString.countOneBits(0)).isEqualTo(0);
        assertThat(bitManipulationString.countOneBits(1)).isEqualTo(1);
        assertThat(bitManipulationString.countOneBits(6)).isEqualTo(2);
    }
}
