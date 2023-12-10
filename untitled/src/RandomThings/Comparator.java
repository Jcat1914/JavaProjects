package RandomThings;

public class Comparator {
    public static void main(String[] args) {
        char [] word = {'J','U','A','N'};
        if(args[0].toUpperCase().toCharArray().equals(word))
            System.out.println("Funciona!!!" + "\n"  + "Que crack");
        else
            System.out.println("No bien!!!");
    }
}
