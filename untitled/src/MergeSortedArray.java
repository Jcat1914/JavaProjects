import com.sun.jdi.IntegerType;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        var nums3 = new ArrayList<Integer>();


        for(int i=0;i<m && i<n; i++){
            if(nums1[i]>0)
                nums3.add(nums1[i]);
            if(nums2[i]>0)
                nums3.add(nums2[i]);
        }
        Collections.sort(nums3);
        System.out.println(nums3);
       var nums = new Integer[m+n];
        for(int i=0; i<nums3.size();i++){
            nums[i] = nums3.get(i);
        }

        System.out.println(Arrays.asList(nums));



    }

    public static void main(String[] args) {
        int[]arr1 = {1,2,3,0,0,0};
        int[]arr2 = {2,5,6};

        MergeSortedArray m = new MergeSortedArray();

       m.merge(arr1,3,arr2,3);
    }
}
