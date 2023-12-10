package SoftwareEng;



public class Calculator{

    public static void main(String[] args) {
        Operations Suma = (x,y)-> x+y;
        Operations subtraction = (x,y)-> x-y;
        Operations Division = (x,y)-> x/y;
        Operations Multiplication = (x,y)-> x*y;

        double op = Suma.operate(10,20);
        System.out.println(op);
        op = subtraction.operate(10,20);
        System.out.println(op);
        op = Division.operate(10,20);
        System.out.println(op);
        op = Multiplication.operate(10,20);
        System.out.println(op);

    }


}
