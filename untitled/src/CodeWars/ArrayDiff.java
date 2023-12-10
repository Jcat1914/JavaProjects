package CodeWars;

import java.util.*;
import RandomThings.*;

public class ArrayDiff {

    public static Integer[] arrayDiff(int[] a, int[] b) {
        ArrayList <Integer> toReturn = new ArrayList<>();
        boolean isValid = false;

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<b.length; j++){
                if(a[i] != b[j])
                    isValid = true;
                else{
                    isValid = false;
                    break;
                }
            }
            if(isValid)
                toReturn.add(a[i]);


        }
        Integer[] n = new Integer[toReturn.size()];

        for(int i = 0; i<n.length; i++){
            n[i] = toReturn.get(i);
        }

        return n;
    }

    public static void main(String[] args) {
        ArrPractice r = new ArrPractice();
        Integer[] s = arrayDiff(new int[]{1,2,2,2,3}, new int[]{2});
        r.printArray(s);
    }

}
