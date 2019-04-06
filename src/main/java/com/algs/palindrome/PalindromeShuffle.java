package palindrome;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PalindromeShuffle {

    public static String makePalindrome(String input) {

        // if the string has an odd number of chars, it has to have at most 1 single char
        // if the string has an even number of chars, all chars have to occurr at least twice
        Map<Character, Integer> charMap = input.chars().boxed()
                .collect(Collectors.toMap(c -> Character.valueOf((char)c.intValue()), v -> 1, Integer::sum));

        long numOfCharsOccurringOnce = charMap.entrySet().stream()
                .filter(e -> e.getValue().equals(1))
                .count();

        if (numOfCharsOccurringOnce > 1) {
            return "-1";
        }

        StringBuilder sb = new StringBuilder(input);
        int count = 0;

        // Sort them so that if the last char has 1 occurrence, it will end in the middle of the string.
        List<Character> sortedCharsDescending = charMap.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        for (Character c : sortedCharsDescending) {
            if (charMap.get(c).equals(1)) {
                sb.setCharAt(input.length() / 2, c);
            }

            for (int i = 0; i < charMap.get(c) / 2; i++) {
                sb.setCharAt(count, c);
                sb.setCharAt(input.length() - 1 - count, c);
                count++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        // cecarar
        // carerac
        // craearc
        // arcecra
        // acrerca

        String result = makePalindrome("cecarar");
        System.out.println("cecarar: " + result);
        System.out.println("is " + result + " palindrome: " + Palindrome.isPalindrome(result));

        result = makePalindrome("ceicarar");
        System.out.println("\nceicarar: " + result);
        System.out.println("is " + result + " palindrome: " + Palindrome.isPalindrome(result));

        result = makePalindrome("abc");
        System.out.println("\nabc: " + result);
        System.out.println("is " + result + " palindrome: " + Palindrome.isPalindrome(result));

        result = makePalindrome("bba");
        System.out.println("\nbba: " + result);
        System.out.println("is " + result + " palindrome: " + Palindrome.isPalindrome(result));

        result = makePalindrome("aab");
        System.out.println("\naab: " + result);
        System.out.println("is " + result + " palindrome: " + Palindrome.isPalindrome(result));

        result = makePalindrome("aabbcaa");
        System.out.println("\naabbcaa: " + result);
        System.out.println("is " + result + " palindrome: " + Palindrome.isPalindrome(result));
    }
}
