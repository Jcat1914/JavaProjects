package RandomThings;

import java.util.Scanner;

public class Josephus {

    static int highestPowerof2(int n)
    {
        int res = 0;
        for(int i = n; i >= 1; i--)
        {

            // If i is a power of 2
            if ((i & (i-1)) == 0)
            {
                res = i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int k = 0;
        int n = 0;
        int result = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("How much people want to play? ");
        n = s.nextInt();

        k = highestPowerof2(n);

        result = (2 * (n- k)) + 1;

        System.out.println("the person in the position " + result + " is going to survive");
    }
}
