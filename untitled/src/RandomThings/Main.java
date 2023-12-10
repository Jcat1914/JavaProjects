package RandomThings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rad = 0;
        double vol;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter radius of the sphere:");
        rad = s.nextDouble();



        vol = (4.0 / 3.0) * Math.PI * Math.pow(rad, 3.0);
        System.out.println("volume of the sphere is: " + vol);
    }
}