import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class duplicateZeros {

//Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
    public static int[] DuplicateZeros(int[] nums){

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                queue.add(0);
                queue.add(0);
            } else
                queue.add(nums[i]);

            Integer first = queue.poll();
            nums[i] = first;


        }

        return nums;

    }
    public static void main(String[] args) {

        int[]arr = {20, 30, 0, 40, 50, 0, 70};
        int[] newArr = DuplicateZeros(arr);


        for (int i=0;i<newArr.length;i++) {

            System.out.print(arr[i] + ", ");

        }
    }
}
