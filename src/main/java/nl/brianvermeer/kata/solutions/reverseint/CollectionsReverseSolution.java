package nl.brianvermeer.kata.solutions.reverseint;

import java.util.Collections;
import java.util.stream.Collectors;

public class CollectionsReverseSolution {

    /*
    Given a 32-bit signed integer, reverse digits of an integer.

    Note:
    Assume we are dealing with an environment that could
    only store integers within the 32-bit signed integer range: [−231,  231 − 1].

    For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
    */

    public int reverse(int x) {
        int abs = Math.abs(x);
        var digitList = String.valueOf(abs).chars()
                .mapToObj(Character::toString)
                .collect(Collectors.toList());

        Collections.reverse(digitList);
        var reverseDigits = digitList.stream().collect(Collectors.joining());

        if (x < 0) {
            reverseDigits = "-"+reverseDigits;
        }

        try {
            return Integer.parseInt(reverseDigits);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        CollectionsReverseSolution reverseInt = new CollectionsReverseSolution();
        System.out.println(reverseInt.reverse(123));
        System.out.println(reverseInt.reverse(-123));
        System.out.println(reverseInt.reverse(120));
        System.out.println(reverseInt.reverse(0));
        System.out.println(reverseInt.reverse(1234567809));
    }
}