package exercises.twosum;

import nl.brianvermeer.kata.excercises.twosum.TwoSum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void setUp(){
        twoSum = new TwoSum();
    }

    @Test
    public void fourNumbersArray(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void threeNumbersArray(){
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }

    @Test
    public void sameNumbersArray(){
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }
}
