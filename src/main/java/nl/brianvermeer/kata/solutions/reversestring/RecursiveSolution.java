package nl.brianvermeer.kata.solutions.reversestring;

import static org.junit.Assert.assertArrayEquals;

public class RecursiveSolution {

    private void helper(char[] chars, int left, int right){
        if(left >= right) return;
        char leftTemp = chars[left];
        chars[left++] = chars[right];
        chars[right--] = leftTemp;
        helper(chars, left, right);
    }

    public void reverseString(char[] s){
        helper(s, 0, s.length -1);
    }

    public static void main(String[] args) {
        RecursiveSolution reverseString = new RecursiveSolution();
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};
        reverseString.reverseString(chars);
        assertArrayEquals(expected, chars);
    }
}
