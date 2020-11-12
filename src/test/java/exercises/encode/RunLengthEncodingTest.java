package exercises.encode;

import nl.brianvermeer.kata.excercises.encode.RunLengthEncoding;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RunLengthEncodingTest {

        private RunLengthEncoding runLengthEncoding;

        @Before
        public void setUp() {
            runLengthEncoding = new RunLengthEncoding();
        }

        @Test
        public void encodeEmpty() {
            Assert.assertEquals("", runLengthEncoding.encode(""));
        }


        @Test
        public void encodeWithOnlySingleValues() {
            Assert.assertEquals("XYZ", runLengthEncoding.encode("XYZ"));
        }

        @Test
        public void encodeWithNoSingleValues() {
            Assert.assertEquals(
                    "2A3B4C",
                    runLengthEncoding.encode("AABBBCCCC"));
        }

        @Test
        public void encodeWithMixedValues() {
            Assert.assertEquals(
                    "12WB12W3B24WB",
                    runLengthEncoding.encode(
                            "WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB"));
        }

        @Test
        public void encodeWithWhitespaceValues() {
            Assert.assertEquals(
                    "2 hs2q q2w2 ",
                    runLengthEncoding.encode("  hsqq qww  "));
        }

        @Test
        public void encodeWithLowercaseValues() {
            Assert.assertEquals(
                    "2a3b4c",
                    runLengthEncoding.encode("aabbbcccc"));
        }


}
