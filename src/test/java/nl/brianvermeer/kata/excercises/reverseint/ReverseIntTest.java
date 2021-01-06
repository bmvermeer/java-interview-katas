package nl.brianvermeer.kata.excercises.reverseint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntTest {

    private ReverseInt reverseInt;

    @Before
    public void setUp(){
        reverseInt = new ReverseInt();
    }

    @Test
    public void simplePositive(){
        assertEquals(321, reverseInt.reverse(123));
    }

    @Test
    public void simpleNegative(){
        assertEquals(-321, reverseInt.reverse(-123));
    }

    @Test
    public void zeroAtTheEnd(){
        assertEquals(21, reverseInt.reverse(120));
    }

    @Test
    public void zero(){
        assertEquals(0, reverseInt.reverse(0));
    }

    @Test
    public void maxValue(){
        assertEquals(0, reverseInt.reverse(1234567809));
    }

}
