package nl.brianvermeer.kata.solutions.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;

public class HashSolution {

    public int[] twoSum_hashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);

        for(int i = 1; i < nums.length; i++){
            int match = target - nums[i];
            if(map.containsKey(match)){
                return new int[]{i, map.get(match)};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public int[] twoSum_hashSet(int[] nums, int target) {
        HashSet<Integer> setOfNums = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(setOfNums.contains(target - nums[i])) {
                return new int[]{i, Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(target-nums[i])};
            };
            setOfNums.add(nums[i]);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        HashSolution twoSum = new HashSolution();
        assertArrayEquals(new int[]{0, 1} , twoSum.twoSum_hashMap(new int[]{3, 3}, 6));
    }
}
