package Discrete_Math;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class baseTenToAny {
    static String TentoAnyBase(int num, int base) {
        LinkedList<Integer> nums = new LinkedList<>();
        int remainder = 1;
        int next = 1;

        while(num > 0){
            //System.out.println("next num " + num);

            next = num/base;
            remainder = num%base;

            num = next;

            nums.push(remainder);

            //System.out.println("Remainder: " + remainder);
        }

//        StringBuilder toReturn = nums.stream().collect(
//                StringBuilder::new, (a,b)-> a.append(b),
//                (c,d)-> c.append(",").append(d));

        StringBuilder toReturn = nums.stream().collect(
                StringBuilder::new,
                (a, b) -> {
                    a.append(b);
                }, (c, d) -> {}
        );

       return toReturn.toString();

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i = 0;
        while (i < 100){
            System.out.print("Number: ");
            int num = s.nextInt();
            System.out.print("\ntoBase? ");
            int base = s.nextInt();
            System.out.println(TentoAnyBase(num,base));
        }

    }
}
