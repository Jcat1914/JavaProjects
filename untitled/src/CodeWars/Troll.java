package CodeWars;

import java.util.Arrays;

public class Troll {
   //replace all the vowels from a string
    public static String disemvowel(String str) {
        // Code away...
        //regex
      return str.replaceAll("[AaEeIiOoUu]", "");

    }

    public static void main(String[] args) {
        System.out.println(disemvowel("Juan Acuna"));
    }

}
