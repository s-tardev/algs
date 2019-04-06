package com.algs.bitmanipulation;

import org.springframework.stereotype.Component;

/**
 * Find the number of 1 in the bit representation of a given number.
 *
 * I think this is a pretty dumb solution.
 */
@Component
class BitManipulationLog {

    public static int countOneBits(int number) {

        if (number == 0) {
            return 0;
        }

        int power = (int) (Math.log(number) / Math.log(2));

        if (number % 2 == 0) {
            return power;
        }

        return power + 1;
    }
}