package nl.brianvermeer.kata.excercises.encode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RunLengthDecodingTest {

    private RunLengthEncoding runLengthEncoding;

    @Before
    public void setUp() {
        runLengthEncoding = new RunLengthEncoding();
    }


    @Test
    public void decodeEmpty() {
        Assert.assertEquals("", runLengthEncoding.decode(""));
    }

    @Test
    public void decodeWithOnlySingleValues() {
        Assert.assertEquals(
                "XYZ",
                runLengthEncoding.decode("XYZ"));
    }

    @Test
    public void decodeWithNoSingleValues() {
        Assert.assertEquals(
                "AABBBCCCC",
                runLengthEncoding.decode("2A3B4C"));
    }

    @Test
    public void decodeWithMixedValues() {
        Assert.assertEquals(
                "WWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB",
                runLengthEncoding.decode("10WB12W3B24WB"));
    }

    @Test
    public void decodeWithWhitespaceValues() {
        Assert.assertEquals(
                "  hsqq qww  ",
                runLengthEncoding.decode("2 hs2q q2w2 "));
    }

    @Test
    public void decodeWithLowercaseValues() {
        Assert.assertEquals(
                "aabbbcccc",
                runLengthEncoding.decode("2a3b4c"));
    }

    @Test
    public void encodeThenDecode() {
        String inOut = "zzz ZZ  zZ";
        String encoded = runLengthEncoding.encode(inOut);
        Assert.assertEquals(inOut, runLengthEncoding.decode(encoded));
    }
    

}
