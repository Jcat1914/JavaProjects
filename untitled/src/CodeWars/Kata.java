package CodeWars;
/*
    Complete the solution so that it returns true if the first argument(string)
    passed in ends with the 2nd argument (also a string). */
public class Kata {
        public static boolean solution(String str, String ending) {
            return str.indexOf(ending, str.length() - ending.length()) != -1;
        }
    public static void main(String[] args) {
        System.out.println(solution("SapoPeta", "Pete"));
    }
}
