package CodeWars;

import org.jetbrains.annotations.NotNull;

import java.lang.module.InvalidModuleDescriptorException;

public class PangramChecker {
    public static boolean check(String sentence) {
        //code
        sentence = sentence.toLowerCase();


        boolean allLetterPresent = true;

        // Loop over each character itself
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // Check if the string does not
            // contains all the letters
            if (!sentence.contains(String.valueOf(ch))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check("Two driven jocks help fax my big quiz."));
    }

    }
