package CodeWars;
/*
* Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
*  which is the number of times you must multiply the digits in num until you reach a single digit.
*
* 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
* */


public class Persist {

    public static int getDigits(long n){
        long m =1;

        while (n>9){
            m = ( n % 10 );
            n /= 10;

            n = n * m;

            m = 1;
        }

        return (int)n;
    }
    public static int persistence(long n) {
        long m = 1, r = n;
        System.out.println(getDigits(n));
      /*  if (r / 10 == 0) {
            return 0;
        }
        for(r = n; r!= 0; r /=10){
            m *= r % 10;
        }*/

        //System.out.println(m);
        //return persistence(m) + 1;
        return (int)n;
    }

    public static void main(String[] args) {
        System.out.println(persistence(44808493));
    }
}

