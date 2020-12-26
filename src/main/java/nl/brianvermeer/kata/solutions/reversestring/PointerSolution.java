package nl.brianvermeer.kata.solutions.reversestring;

import static org.junit.Assert.assertArrayEquals;

public class PointerSolution {

    public void reverseString(char[] s) {
        int front = 0, back = s.length -1;
        while(front < back){
            char frontChar = s[front], BackChar = s[back];
            s[front] = BackChar;
            s[back] = frontChar;
            front++;
            back--;
        }
    }

    public static void main(String[] args) {
        RecursiveSolution reverseString = new RecursiveSolution();
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};
        reverseString.reverseString(chars);
        assertArrayEquals(expected, chars);
    }

}
