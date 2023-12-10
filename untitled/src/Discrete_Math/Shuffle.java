package Discrete_Math;

import java.util.Arrays;

public class Shuffle {

    public static void main(String[] args) {
        int [] rands = {5,3,6,5,6};

        int [] input = {34,57,72,94,101,135};
        int a = 0;
        int b = 0;
        int indexRand = 0;


        for(int i = 0; i < input.length-1;i++){
            a = input [i];
            indexRand = rands [i]-1;
            b = input[indexRand];

            input [indexRand] = a;

            input[i] = b;

            System.out.printf("i = %d%n", i);
            Arrays.stream(input).forEach(n -> System.out.print(n + ","));
            System.out.println();



            }


    }
}


