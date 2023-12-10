package Discrete_Math;
import java.util.Scanner;

public class CreditCars {
    static String Comparator(String nums){
        try {
            int last = FindLastDigitEx(nums);
            int providedLast = Integer.parseInt(String.valueOf(nums.charAt(nums.length()-1)));

            return (last == providedLast) ? "IsValid": "InValid";

        } catch (Exception e){
            return "The credit card number should only contain integer values";
        }
    }
    static int [] ConvertCharToInt (char[] nums){
        int [] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            result[i] = Integer.parseInt(String.valueOf(nums[i]));
        }
        return result;
    }
    static int FindLastDigitEx(String nums) {

        int c = 0;
        int[] numbers = ConvertCharToInt(nums.toCharArray());
        int result = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (i % 2 != 0 && numbers[i-1] != 9) {
                c = (numbers[i - 1] * 2);
                result += (c % 9) ;
                //Modulo hacer modulo 9
            }
            else
                result += numbers[i - 1];
        }
        return ((10 - (result % 10)) % 10);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            System.out.print("Input your credit card number: ");
            String creditCard = s.nextLine();
            String result = Comparator(creditCard);

            if(result.equals("IsValid") || result.equals("InValid") )
                System.out.println(String.format("The credit card: %s -----> %s", creditCard, result));
            else
                System.out.println(String.format("Error!!! " + result +  " " +"_____Try Again"));

        }

}
