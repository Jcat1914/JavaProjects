import java.lang.reflect.Array;
import java.util.ArrayList;
import java.math.*;

public class LargestNumber {
    public static Number getLargestNumber(ArrayList<Number> list){

        if(list == null || list.size() == 0)
            return null;

        Number number = list.get(0);

        for(int i = 1; i< list.size();i++)
            if(number.doubleValue()<list.get(i).doubleValue())
                number = list.get(i);

                return number;
    }

    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(new BigInteger("932894842984859239485923849582398445"));
        list.add(2050);
        list.add(98535.234);
        list.add(new BigDecimal("984454534.545345354653643"));
        list.add(new BigInteger("93289484298485923948592384958239844583872"));


        System.out.println("The largestNumber in the list is: " + getLargestNumber(list));


    }

}
