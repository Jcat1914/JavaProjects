package Discrete_Math;

import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class PiFinder {
    public static ArrayList PiSearch(String num){
        String Pi = "141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359408128481117450284102701938521105559644622948954930381964428810975";
        char [] nums = num.toCharArray();
        int cursor = 0;
        ArrayList<Integer> index = new ArrayList<>();
        int digit = 0;

        for(int i =1; i< Pi.length();i++){
            digit = Integer.parseInt(Pi.substring(i-1, i));

            if(digit == Integer.parseInt(String.valueOf(nums[cursor]))){
                index.add(i);
                cursor ++;
            }
            else{
                cursor = 0;
                index.removeAll(index);
            }

            if(index.size()==nums.length)
                break;

        }
        return index;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(PiSearch((s.nextLine())));


    }





}
