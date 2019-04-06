package palindrome;

public class Palindrome {

    public static boolean isPalindrome(String input) {

        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            // If the string has odd number of chars, the middle char will not be compared
            if (input.charAt(i) == input.charAt(input.length() - 1 - i)) {
                continue;
            }

            isPalindrome = false;
        }

        return isPalindrome;
    }

    public static void main(String[] args) {

        boolean civic = isPalindrome("civic");
        System.out.println("civic: " + civic);
        assert civic == true;

        boolean deed = isPalindrome("deed");
        System.out.println("deed: " + deed);
        assert deed == true;

        boolean toyota = isPalindrome("toyota");
        System.out.println("toyota: " + toyota);
        assert toyota == false;
    }
}
