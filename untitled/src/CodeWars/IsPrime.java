package CodeWars;
import java.math.*;
import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IsPrime {

        public static boolean isPrime(int num) {
            boolean toReturn = true;
            int root = (int) Math.sqrt(num);
            if(num<=1){
                return false;
            }
           for(int i = 2; i<= root;i++){
               if ((num % i) == 0) {
                   toReturn = false;
                   break;
               }
           }

            return toReturn; //TODO
    }

    public static void main(String[] args) {


    }

}


