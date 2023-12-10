import RandomThings.ArrPractice;

public class pru {
    private Integer[] LastToFirst(Integer[] arr){
        Integer[] nums = new Integer[arr.length];
        Integer index =0;

        for(int i = arr.length -1; i >=0; i --){
            /*{10,20,30,40}
            * {40,30,20,10}*/
            nums[index] = arr[i];

            index++;
        }



        return nums;
    }

    public static void main(String[] args) {
        pru  p = new pru();
        ArrPractice<Integer> a = new ArrPractice<>();
        Integer[] nums = {10,20,30,40};


       a.printArray(p.LastToFirst(nums));

    }
}
