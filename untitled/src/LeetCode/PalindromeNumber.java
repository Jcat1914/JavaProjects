package LeetCode;
import java.lang.*;
import java.sql.ResultSet;
import java.util.Arrays;

public class PalindromeNumber {
    /*
    Given an integer x, return true if x is palindrome integer.

    An integer is a palindrome when it reads the same backward as forward.

    For example, 121 is a palindrome while 123 is not.
    */
    public boolean isPalindrome(int x) {
       return (x<0)||(ReverseNum(x)!= x) ? false: true;
    }

    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(30));

    }
    public static int ReverseNum(int x){
        int lastDigit=0;
        int reverse = 0;
        while(x>0){
            lastDigit = x%10;
            reverse = (reverse*10) + lastDigit;
            x/=10;
        }
        return reverse;

    }

}
