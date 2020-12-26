package exercises.reversestring;

import nl.brianvermeer.kata.excercises.reversestring.ReverseString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseStringTest {

    private ReverseString reverseString;

    @Before
    public void setUp(){
        reverseString = new ReverseString();
    }

    @Test
    public void hello(){
        char[] chars = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] reversed = new char[]{'o', 'l', 'l', 'e', 'h'};
        reverseString.reverseString(chars);
        assertArrayEquals(reversed, chars);
    }

    @Test
    public void longestWord(){
        char[] chars = "pneumonoultramicroscopicsilicovolcanoconiosis".toCharArray();
        char[] reversed = "sisoinoconaclovociliscipocsorcimartluonomuenp".toCharArray();
        reverseString.reverseString(chars);
        assertArrayEquals(reversed, chars);

    }


}
