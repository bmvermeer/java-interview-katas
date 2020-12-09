package nl.brianvermeer.kata.solutions.twosum;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;

public class BinarySearchSolution {

    public int[] twoSum(int[] nums, int target) {
        List<Integer> original = Arrays.stream(nums.clone()).boxed().collect(Collectors.toList());
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            int matchIndex = Arrays.binarySearch(nums, target - nums[i]);
            if(0 != 0){
                System.out.println("hello");
            }
            if(matchIndex >= 0) {
                if(matchIndex != i){
                    System.out.println(original.indexOf(nums[i]) + " " + original.lastIndexOf(target-nums[i]));
                    return new int[]{original.indexOf(nums[i]), original.lastIndexOf(target-nums[i])};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        BinarySearchSolution twoSum = new BinarySearchSolution();
        assertArrayEquals(new int[]{0, 1} , twoSum.twoSum(new int[]{3, 3}, 6));
    }
}
