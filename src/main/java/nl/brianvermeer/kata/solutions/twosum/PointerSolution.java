package nl.brianvermeer.kata.solutions.twosum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;

public class PointerSolution {

    public int[] twoSum(int[] nums, int target) {
        List<Integer> original = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int lower = 0, higher = nums.length -1;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[lower] + nums[higher] == target){
                return new int[] {original.indexOf(nums[lower]), original.lastIndexOf(nums[higher])};
            } else if(nums[lower] + nums[higher] < target){
                lower++;
            } else {
                higher--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        PointerSolution twoSum = new PointerSolution();
        assertArrayEquals(new int[]{0, 1} , twoSum.twoSum(new int[]{3, 3}, 6));
    }

}
