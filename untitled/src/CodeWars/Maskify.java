package CodeWars;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Maskify {

    public static String maskify(String str) {
        char[] nums = str.toCharArray();
        if (str.length() <= 4) {
            return str;
        }
        for (int i = 0; i < nums.length - 4; i++) {
            nums[i] = '#';
        }
        return new String(nums);
    }

    public static void main(String[] args) {
        System.out.println(maskify("908776765454565545345"));
    }

    public static String maskify2(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
}