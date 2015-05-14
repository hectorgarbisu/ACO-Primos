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
                return false;
            }
//            if (criterioExtendido(b,n)) return false; //Comprobacion muy costosa con BigInteger
        }
        return true;
    }
  
    public static SortedSet<BigInteger> numAle(BigInteger n, int m) {
        SortedSet<BigInteger> result = new TreeSet<>();
        BigInteger newElem;
        while (result.size() != m && n.subtract(BigInteger.ONE).compareTo(BigInteger.valueOf(result.size())) != 0) {
            newElem = (new BigInteger(n.bitLength(),new Random()));
            while(newElem.compareTo(BigInteger.ONE)<0||newElem.compareTo(n)>=0){
                newElem = (new BigInteger(n.bitLength(),new Random()));
            }
            result.add(newElem);
        }
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
//              Hay una perdida enorme de tiempo en este calculo, incluso para numeros en el rango de long
                mcd = n.gcd(b.pow(dAndR[0].intValue()).subtract(BigInteger.ONE)); 
//              mcd = mcd(n,b.pow(dAndR[0].intValue()).subtract(BigInteger.ONE)); //BigInteger.pow ES MUUUUUUUUY INEFICIENTE
//              mcd = mcd(n,b.modPow(dAndR[0],(BigInteger.ONE)).subtract(BigInteger.ONE)); //BigInteger.pow ES MUUUUUUUUY INEFICIENTE
                if(mcd.compareTo(BigInteger.ONE)>0&&(mcd.compareTo(n)<0)) return true;
            }
        }
        return false;
    }
}
