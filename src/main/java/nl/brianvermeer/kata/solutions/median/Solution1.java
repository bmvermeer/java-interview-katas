package nl.brianvermeer.kata.solutions.median;

import nl.brianvermeer.kata.excercises.median.MedianSortedArrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution1 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2){

        List<Integer> sortedList = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        return Stream.of(sortedList)
                .anyMatch(list -> list.size() % 2 == 0 ) ? ((sortedList.get((sortedList.size()/2)-1)) + (sortedList.get(sortedList.size()/2)))/2.000 : sortedList.get(sortedList.size()/2);

    }

    public static void main(String[] args) {
        MedianSortedArrays medianSortedArrays = new MedianSortedArrays();
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        medianSortedArrays.findMedianSortedArrays(nums1, nums2);

    }
}
