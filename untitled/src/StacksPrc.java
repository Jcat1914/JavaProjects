import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StacksPrc {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        System.out.println(stack);

        Integer[] nums = new Integer[5];
        String read = "";


        for (int i=0; i< nums.length;i++){
            nums[i] = stack.pop();
        }

        System.out.println(Arrays.stream(nums).toList());

        Scanner in = new Scanner(System.in);

        System.out.print("What is the string you want to try: ");

        char [] s = in.nextLine().toCharArray();

        System.out.println(Automata(s));

      /*
      * while (stack.peek()!=40){
            stack.pop();
        }

        System.out.println(stack);
      *
      * */
        }

        public static boolean Automata(char[] string){
            Stack<Character> stack = new Stack<>();

            for (var c: string) {
                if(c == 'a'){
                    stack.push('x');
                    continue;
                }
                if(c == 'b'){
                    if(!stack.isEmpty()){
                        stack.pop();
                        continue;
                    }else
                        return false;
                }
                }
            if (stack.isEmpty())
                return true;
             else
                return false;

        }

    }


