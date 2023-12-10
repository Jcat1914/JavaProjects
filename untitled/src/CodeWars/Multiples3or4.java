package CodeWars;

public class Multiples3or4 {

    public int solution(int number) {
        //TODO: Code stuff here
        int multiple = 0;

        for (int i = 0; i < number; i++) {

            if (i % 5 == 0 || i % 3 == 0) {
                multiple += i;
            }
        }
        return multiple;
    }

    public static void main(String[] args) {
        System.out.println(new Multiples3or4().solution(20));
    }
}
