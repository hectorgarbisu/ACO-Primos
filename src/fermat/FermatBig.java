package fermat;

import java.math.BigInteger;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;


public class FermatBig {
    
      public static boolean esPrimo(BigInteger n, int m) {
        SortedSet<BigInteger> list = numAle(n, m);
        for (BigInteger b : list) {
            if (b.modPow(n.subtract(BigInteger.ONE),n).compareTo(BigInteger.ONE)!=0)  return false; // expMod debe operar con long
//            if (criterioExtendido(b,n)) return false;
        }
        return true;
    }
 
    public static int mcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static SortedSet<BigInteger> numAle(BigInteger n, int m) {
        SortedSet<BigInteger> result = new TreeSet<>();
        while (result.size() != m && n.subtract(BigInteger.ONE).compareTo(BigInteger.valueOf(result.size()))!= 0) {
            result.add(new BigInteger(n.bitLength(),new Random()));
        }
        return result;
    }



    private static boolean criterioExtendido(int b, int n) {
        int k;
        int mcd;
        for(int j = 2;j<(Math.log(n)/Math.log(2));j++){
            if((n-1)%Math.pow(2,j)==0){  
                k = (int) ((n-1)/Math.pow(2,j)); //Esta operacion es segura
                mcd = mcd((int) (Math.pow(b,k)-1),n);//falta de precision <
                if((1<mcd)&&(mcd<n)) return true;
            }
        }
        return false;
    }

}
