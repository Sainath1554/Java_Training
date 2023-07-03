package Week4.Day2;

import java.util.*;

public class TwoSum {
    public int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                int complementIndex = map.get(complement);
                return new int[]{complementIndex, i};
            }

            map.put(nums[i], i);
        }

        return new int[0]; // Return an empty array if no solution is found
    }
}
