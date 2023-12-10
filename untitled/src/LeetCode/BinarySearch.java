package LeetCode;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int rigth = nums.length - 1;
        int mid = 0;
        int toReturn = 0;
        while (left <= rigth) {
            mid = left + ((rigth - left) / 2);

            if (target != nums[mid]) {
                if (target < nums[mid])
                    rigth = mid - 1;
                else
                    left = mid + 1;
            }
            return toReturn = (mid == target) ? mid : -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5,6,7}, 1));
    }

    }

