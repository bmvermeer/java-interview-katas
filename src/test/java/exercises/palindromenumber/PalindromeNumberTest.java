package exercises.palindromenumber;

import nl.brianvermeer.kata.excercises.palindromenumber.PalindromeNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @Before
    public void setUp() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void positiveIsPalindrome(){
        assertEquals(true, palindromeNumber.isPalindrome(121));
    }

    @Test
    public void negativeNotPalindrome(){
        assertEquals(false, palindromeNumber.isPalindrome(-121));
    }

    @Test
    public void negativeNotPalindrome2(){
        assertEquals(false, palindromeNumber.isPalindrome(-101));
    }


}
