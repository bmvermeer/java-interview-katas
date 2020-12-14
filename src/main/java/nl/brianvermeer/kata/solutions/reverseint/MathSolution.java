package nl.brianvermeer.kata.solutions.reverseint;

import static org.junit.Assert.assertEquals;

public class MathSolution {

    public int reverse(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try{
            return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        MathSolution reverseInt = new MathSolution();
        assertEquals(-321, reverseInt.reverse(-123));
    }
}
