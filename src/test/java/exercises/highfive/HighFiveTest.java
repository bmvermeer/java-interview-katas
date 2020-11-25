package exercises.highfive;

import nl.brianvermeer.kata.excercises.highfive.HighFive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighFiveTest {

    @Test
    public void highFiveTest(){
        HighFive highFive = new HighFive();
        int[][] input = new int[][]{{1,100},{7,100},{1,100},{7,100},{1,100},{7,100},{1,100},{7,100},{1,100},{7,100}};
        int[][] expected = new int[][]{{1,100},{7,100}};
        assertEquals(expected, highFive.highFive(input));
    }
}
