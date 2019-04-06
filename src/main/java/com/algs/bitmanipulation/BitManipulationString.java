package bitmanipulation;

/**
 * Find the number of 1 in the bit representation of a given number.
 *
 * I think this is a pretty dumb solution.
 */
class BitManipulationString {

    public static int countOneBits(int number) {

        return Integer.toBinaryString(number)
                .chars()
                .filter(ch -> ch == '1')
                .map(e -> 1)
                .sum();

    }

    public static void main(String[] args) {

        int oneBits = countOneBits(6);
        System.out.println("Number of 1 bits: " + oneBits);

        assert oneBits == 2;
    }
}