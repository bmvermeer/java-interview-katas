package nl.brianvermeer.kata.solutions.palindromenumber;

import static org.junit.Assert.assertEquals;

public class MathSolution {

    public boolean isPalindrome(int x) {
        if(x < 0 || x % 10 == 0 && x != 0) return false;
        int rev = 0;
        while(x > rev) {
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }

    public static void main(String[] args) {
        MathSolution palindromeNumber = new MathSolution();
        assertEquals(true, palindromeNumber.isPalindrome(121));
    }
}
