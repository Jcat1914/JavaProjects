package CodeWars;
//Are they the "same"?
/*Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the "same" elements, with the same multiplicities (the multiplicity of a member is the number of times it appears). "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
  a = [121, 144, 19, 161, 19, 144, 19, 11]
  b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]

  a = [121, 144, 19, 161, 19, 144, 19, 11]
  b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]

*/
public class AreSame {

    public static boolean comp(int[] a, int [] b){
        boolean toReturn = false;
        int j = a.length - 1;
        for(int i =0; i<a.length; i++){

            if(a[j] * a[j] == b[i]){
                toReturn = true;
            }
            else
                return false;

            if(j == a.length-1){
                j = -1;
            }
            j++;
        }

        return toReturn;
    }

    public static void main(String[] args) {
        System.out.println(comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11},new int []{121, 14641, 20736, 361, 25921, 361, 20736, 360}));
    }

}
