
import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] result = new int[2];
        int[] number = {10, 20, 30, 40, 50};
        int targets = 60;

        result = TwoSum.twoSum(number, targets);

        for (int i=0; i < result.length; i++) {
            if(i == result.length-1)
                System.out.print(result[i]);
            else
                System.out.print(result[i] + ", ");
        }

       Scanner sc = new Scanner (System.in);
        System.out.println();
        System.out.println("pulsa cualquier tecla para salir ");
        sc.nextLine();
    }
}
