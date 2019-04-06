package com.algs.bitmanipulation;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BitManipulationLogTest {

    private BitManipulationLog bitManipulationLog;

    @Before
    public void setup() {
        bitManipulationLog = new BitManipulationLog();
    }

    @Test
    public void test_countOneBits() {
        assertThat(bitManipulationLog.countOneBits(0)).isEqualTo(0);
        assertThat(bitManipulationLog.countOneBits(1)).isEqualTo(1);
        assertThat(bitManipulationLog.countOneBits(6)).isEqualTo(2);
        assertThat(bitManipulationLog.countOneBits(7)).isEqualTo(3);
    }
}
