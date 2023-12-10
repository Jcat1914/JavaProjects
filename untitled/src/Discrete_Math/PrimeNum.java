package Discrete_Math;

public class PrimeNum {

        public static boolean isPrime(int num) {
            boolean ans = true;
            int root = (int) Math.sqrt(num);
            if(num<=1){
                return false;
            }
            for(int i = 2; i<= root;i++){
               if ((num % i) == 0) {
                   ans = false;
                   break;
               }
           }

            return ans; //TODO
    }

    public static void main(String[] args) {

        System.out.println(isPrime(49));

           for(int i = 1;i<10;i++){
               if(isPrime(i))
                   System.out.println(i);
             //System.out.println(String.format("numero: %d ----> %b", i, isPrime(i)));

           }


    }

}


