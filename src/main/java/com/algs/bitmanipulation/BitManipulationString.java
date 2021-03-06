package com.algs.bitmanipulation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Find the number of 1 in the bit representation of a given number.
 *
 * I think this is a pretty dumb solution.
 */
@Component
class BitManipulationString {

    public static int countOneBits(int number) {

        return Integer.toBinaryString(number)
                .chars()
                .filter(ch -> ch == '1')
                .map(e -> 1)
                .sum();

    }
}