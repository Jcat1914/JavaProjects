import java.util.Scanner;

public class CreditC {
    public static boolean verifyCreditCard(String creditCardNumber) {
        // Remove any non-digit characters from the credit card number
        creditCardNumber = creditCardNumber.replaceAll("\\D", "");

        // Apply the Luhn algorithm to verify the credit card number
        int sum = 0;
        int length = creditCardNumber.length();
        for (int i = 1 ; i < creditCardNumber.length(); i++) {

            int digit = Integer.parseInt(creditCardNumber.substring(i-1, i));

            if (i%2!=0 && digit!=9) {
                digit *= 2;
                if(digit > 9)
                    digit %= 9;
            }
            sum += digit;

        }
        int lastDigit = Integer.parseInt(creditCardNumber.substring(length-1, length));
        return (10-sum%10) == lastDigit;
    }

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.print("Input your credit card: ");
        System.out.println(verifyCreditCard(c.nextLine()));


    }
}

