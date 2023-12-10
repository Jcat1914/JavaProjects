import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] toReturn;

        /**
         * {10,20,30,40}
         * target = 50
         * 50-10 = 40;
         * map{40,0
         *         }
         *
         */

        for(int i =0; i<nums.length; i++){
            int j = nums[i] - target;

            if(map.containsKey(j)){
                return new int[]{
                        map.get(j), i};
            }

            map.put(j, i);
        }
        return null;
    }
}
