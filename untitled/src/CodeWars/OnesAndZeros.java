package CodeWars;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnesAndZeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String num = "";
        // Your Code
        for (int i=0;i< binary.size();i++) {
            num = num.concat(String.valueOf(binary.get(i)));
        }
        return Integer.parseInt(num,2);
    }
    public static void main(String[] args) {
        int num = 18;

        Integer [] nums = {1,1,0,0,1,1};
        List<Integer> list = Arrays.asList(nums);
        System.out.println(ConvertBinaryArrayToInt(list));
    }
}



