package nl.brianvermeer.kata.solutions.reversestring;

import java.util.stream.IntStream;

public class IntstreamSolution {

    public void reverseString(char[] s) {
        var halfway = s.length / 2;
        var end = s.length-1;
        IntStream.range(0,halfway)
                .forEach(i -> switchItem(s, i, end-i));
    }

    private void switchItem(char[] s, int first, int second) {
        var temp = s[first];

        s[first] = s[second];
        s[second] = temp;
    }

    public static void main(String[] args) {
        IntstreamSolution rs = new IntstreamSolution();
        char[] testString = "hallo".toCharArray();
        rs.reverseString(testString);
        System.out.println(testString);

        testString = "pneumonoultramicroscopicsilicovolcanoconiosis".toCharArray();
        rs.reverseString(testString);
        System.out.println(testString);
    }
}
