package RandomThings;

import org.jetbrains.annotations.NotNull;

public class ArrPractice <R>{

    public R [] MoveRigth(R @NotNull [] arr, R toInsert ){

        for(int i =(int) arr.length-2; i >=0;i-- ){
            arr[i+1] = arr[i];
        }
        arr[0] = toInsert;

        return arr;
    }

    public static void main(String[] args) {
        final String []names = {"Juan", "Carlos", "Acuna", "Talavera", "Cruck"};
        final String toAdd = "Crack";

      ArrPractice<Integer> array = new ArrPractice<>();
        System.out.println();

        Integer[] nums = {10,20,30,40,50};
        array.printArray(ArrPractice.LastToFirst(nums));

        /*
        * {100,10,20,40,50,60,30}
        * */

    }

    public void printArray (R [] arr) {
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }
    }

    private static <T>T[] LastToFirst(T[] arr){
        T[] nums = arr.clone();

        Integer index =0;

        for(int i = arr.length -1; i >=0; i --){
            /*{10,20,30,40}
             * {40,30,20,10}*/
            nums[index] = arr[i];

            index++;
        }



        return nums;
    }
    }
