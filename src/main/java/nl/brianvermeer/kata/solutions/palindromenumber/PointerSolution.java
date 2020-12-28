package nl.brianvermeer.kata.solutions.palindromenumber;

import static org.junit.Assert.assertEquals;

public class PointerSolution {

    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int tmp = x;
        int rev = 0;
        while(tmp > 0) {
            rev = (rev * 10) + (tmp % 10);
            tmp /= 10;
        }
        if(x == rev) return true;
        return false;
    }

    public static void main(String[] args) {
        PointerSolution palindromeNumber = new PointerSolution();
        assertEquals(true, palindromeNumber.isPalindrome(121));
    }
}
