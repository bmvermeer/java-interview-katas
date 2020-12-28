package exercises.romantoint;

import nl.brianvermeer.kata.excercises.romantoint.RomanToInteger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanToIntegerTest {

    private RomanToInteger romanToInteger;

    @Before
    public void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    public void three() {
        assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test
    public void four() {
        assertEquals(4, romanToInteger.romanToInt("IV"));
    }

    @Test
    public void nine() {
        assertEquals(9, romanToInteger.romanToInt("IX"));
    }

    @Test
    public void fiftyEight() {
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }

    @Test
    public void nineteenNinetyNine() {
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}
