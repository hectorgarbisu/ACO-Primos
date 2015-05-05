package fermat;

import java.math.BigInteger;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;


public class FermatBig {
    
      public static boolean esPrimo(BigInteger n, int m) { /// TAL VEZ NO DEBERIA SER STATIC
        SortedSet<BigInteger> list = numAle(n, m);
        for (BigInteger b : list) {
            if (b.modPow(n.subtract(BigInteger.ONE),n).compareTo(BigInteger.ONE)!=0){
//                System.out.println("hello2!"+b+" "+n);
                return false;
            }
//            if (criterioExtendido(b,n)) return false; //Comprobacion muy costosa con BigInteger
        }
        return true;
    }
  
    public static BigInteger mcd(BigInteger a, BigInteger b) {
        BigInteger r;
        while (b.compareTo(BigInteger.ZERO)!= 0) {
            r = a.mod(b);
            a = b;
            b = r;
        }
        return a;
    }

    public static SortedSet<BigInteger> numAle(BigInteger n, int m) {
        SortedSet<BigInteger> result = new TreeSet<>();
        while (result.size() != m && n.subtract(BigInteger.ONE).compareTo(BigInteger.valueOf(result.size())) != 0) {
            result.add((new BigInteger(n.bitLength(),new Random())).add(new BigInteger("1"))); //se suma 1 para prevenir el testigo 0
//            System.out.println("añadido 1 mas");
//        System.out.println(result.size()+" "+n.subtract(BigInteger.ONE));
        }
//        System.out.println(result.size()+"2");
        return result;
    }



    private static boolean criterioExtendido(BigInteger b, BigInteger n) {
        BigInteger mcd;
        BigInteger[] dAndR; //cociente y resto
        BigInteger nHalf = n;
        int nlog = 0;
        while(nHalf.compareTo(BigInteger.ONE)>0){
            nHalf=nHalf.shiftRight(1);
            nlog++;
        }
        for(int j = 2;j<nlog;j++){ 
            dAndR = n.subtract(BigInteger.ONE).divideAndRemainder(new BigInteger(Integer.toString(j)));
            if(dAndR[1].compareTo(BigInteger.ZERO)==0){  //(n-1)%Math.pow(2,j)==0
//              equivalente a: mcd = mcd((int) (Math.pow(b,k)-1),n);
//              Hay una perdida enorme de tiempo en este calculo, incluso para numeos en el rango de long
//              mcd = n.gcd(b.pow(dAndR[0].intValueExact()).subtract(BigInteger.ONE)); 
                mcd = mcd(n,b.pow(dAndR[0].intValue()).subtract(BigInteger.ONE));
                if(mcd.compareTo(BigInteger.ONE)>0&&(mcd.compareTo(n)<0)) return true;
            }
        }
        return false;
    }
}
