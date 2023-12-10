package RandomThings;

public class sum {
    public static int Suma(int ... nums){
        int suma = 0;

        for(int i =0; i < nums.length; i ++){

            suma += nums[i];
        }

        return suma;
    }

    public static void main(String [] args) {
        int suma = 0;

        for(int i =0; i < args.length; i++){
            suma+= Integer.parseInt(args[i]);
        }

        System.out.println(suma);
    }
}
