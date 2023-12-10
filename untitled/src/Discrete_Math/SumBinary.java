package Discrete_Math;

public class SumBinary {
    static String SumaBinaria(String a, String b){


        int x = Integer.parseInt(a,2);
        int y = Integer.parseInt(b,2);

        int result = x + y;

        return Integer.toBinaryString(result);
    }

    public static void main(String[] args) {
        System.out.println(SumaBinaria("11011" , "1101"));
    }
}


