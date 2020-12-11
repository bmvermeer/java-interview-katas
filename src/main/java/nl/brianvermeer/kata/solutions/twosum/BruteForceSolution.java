package nl.brianvermeer.kata.solutions.twosum;

import org.junit.Assert;

import static org.junit.Assert.assertArrayEquals;

public class BruteForceSolution {

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i <nums.length; i++) {
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    num1 = i;
                    num2 = j;
                }
            }
        }
        int[] res = {num1, num2};
        return res;
    }

    public static void main(String[] args) {
        BruteForceSolution twoSum = new BruteForceSolution();
        assertArrayEquals(new int[]{0, 1} , twoSum.twoSum(new int[]{3, 3}, 6));
        assertArrayEquals(new int[]{0, 1} , twoSum.twoSum2(new int[]{3, 3}, 6));
    }
}
