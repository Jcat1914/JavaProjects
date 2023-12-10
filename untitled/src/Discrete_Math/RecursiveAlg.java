package Discrete_Math;

public class RecursiveAlg {
    static int recursion(int n){
        int res;
        if(n < 2)
            return 1;
        else
            res = n + recursion(n-1);

       return res;
    }

    public static void main(String[] args) {
        System.out.println(recursion(20));
    }
}
