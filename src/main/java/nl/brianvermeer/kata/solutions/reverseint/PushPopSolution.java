package nl.brianvermeer.kata.solutions.reverseint;

import static org.junit.Assert.assertEquals;

public class PushPopSolution {

    public int reverse(int x) {
        long reversed = 0;
        while( x != 0) {
            reversed = reversed * 10 + (x %10);
            x /=10;
        }

        if(reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) reversed;
        }
    }


    public static void main(String[] args) {
        PushPopSolution reverseInt = new PushPopSolution();
        assertEquals(-321, reverseInt.reverse(-123));
    }
}
