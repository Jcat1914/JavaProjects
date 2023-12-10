package Discrete_Math;

import java.util.ArrayList;
import java.util.HashMap;



import static Discrete_Math.PrimeNum.isPrime;

public class SRC {
    public static ArrayList<Integer> extendedEuclides(int a, int b){
        int c = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int as = 1;
        int at = 0;
        int t = 0;
        ArrayList<Integer> qs = new ArrayList<>();
        ArrayList<Integer> rs = new ArrayList<>();
        ArrayList<Integer> ss = new ArrayList<>();
        ArrayList<Integer> ts = new ArrayList<>();

        while(b != 0){
            q = a/b;
            r = a%b;

            qs.add(q);
            rs.add(r);

            a = b;
            b = r;
        }

        for (int i = qs.size()-1; i>=0;i--){

            s = at;
            t = as-(at*qs.get(i));

            ss.add(s);
            ts.add(t);

            as = s;
            at = t;
        }

        ArrayList<Integer> toReturn = new ArrayList<>();
        toReturn.add(ss.get(ss.size()-1));
        toReturn.add(ts.get(ts.size()-1));


        return toReturn;

    }

    static HashMap<String, Integer> Encypter(int p, int q, int n, int msg){

        while(isPrime(p) && isPrime(q) && msg <= p*q-1){
            int s = 0;
            int z = p*q;
            int phi = (p-1)*(q-1);

            HashMap<String,Integer> toReturn = new HashMap<>();
            msg = exp_mod(msg, n, z);

            toReturn.put("phi", phi);
            toReturn.put("msg", msg);
            toReturn.put("n", n);
            toReturn.put("z", z);

            return toReturn;
        }

        return null;
    }

    static int Decrypter(int phi, int c, int n, int z){
        ArrayList<Integer> st = extendedEuclides(n, phi);
        int sprime = st.get(0);
        int s = 3961;
        return exp_mod(c,s,z);
    }
    public static void main(String[] args) {
        int p = 59;
        int q = 101;
        int n = 41;

        HashMap<String,Integer> encyption = Encypter(p,q,n,5648);
        int phi = encyption.get("phi");
        int c = encyption.get("msg");;
        int z = encyption.get("z");;

        System.out.println("Encryption: "+ c);

        System.out.println("Decriptyon: " + Decrypter(phi,c,n,z));

    }
    static int exp_mod(int a, int n, int z){
        int result = 1;
        int x = a%z;

        while(n>0){
            if(n%2 ==1)
                result = (result * x) %z;
            x = (x*x)%z;

            n = n/2;
        }

        return result;
    }



}
