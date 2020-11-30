package exercises.median;

import nl.brianvermeer.kata.excercises.median.MedianSortedArrays;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedianSortedArraysTest{

    private MedianSortedArrays medianSortedArrays;

    @Before
    public void setUp(){
        medianSortedArrays = new MedianSortedArrays();
    }

    @Test
    public void checkOddSortedArrayMedian(){
        int[] num1 = {1, 3};
        int[] num2 = {2};
        double result = 2.0000;

        assertEquals(result, medianSortedArrays.findMedianSortedArrays(num1, num2),0);
    }

    @Test
    public void checkEvenSortedArrayMedian(){
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        double result = 2.5000;

        assertEquals(result, medianSortedArrays.findMedianSortedArrays(num1, num2),0);
    }
}
