package CodeWars;

import java.text.CharacterIterator;
import java.util.Arrays;
import java.util.stream.Stream;

public class ReplaceAlphabetPosition {
    private String replacement (String word){

        char [] words = word.toUpperCase().replace(" ","").toCharArray();
        int[] toReturn = new int[words.length];
        StringBuilder b = new StringBuilder();
        for(int i =0;i< words.length;i++){

            toReturn[i] = words[i] - 'A';
            b.append(toReturn[i] + " ");
        }


        return b.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReplaceAlphabetPosition().replacement("John Cena"));
    }
}
