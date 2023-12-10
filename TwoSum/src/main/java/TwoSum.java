import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        /*Given an array of integers nums and
        an integer target, return indices of
        the two numbers such that they add up
        to target.*/

        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int reqNum = (int) (target - nums[i]);
            if (indexMap.containsKey(reqNum)) {
                int toReturn[] = {indexMap.get(reqNum), i};
                return toReturn;
            }

            indexMap.put(nums[i], i);
        }
            return null;
        }
}