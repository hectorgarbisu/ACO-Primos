
package fermat;

import java.math.BigInteger;


public class Pruebas {
    
    public static void probarLong(int m, boolean verbose){
        int[] primos = ColeccionPrimos.getLongPrimeList();
        int noPrimo;
        int erroresP = 0;
        int erroresNP = 0;
        boolean rPrimo;
        boolean rNoPrimo;
        for (int primo : primos) {
            noPrimo = primo+7;
            rPrimo = Fermat.esPrimo(primo,m);
            if(!rPrimo) erroresP++;
            rNoPrimo = Fermat.esPrimo(noPrimo,m);
            if(rNoPrimo) erroresNP++;
            if(verbose)System.out.println("primo "+primo+" : "+rPrimo+", no primo "+noPrimo+": "+rNoPrimo);
        }
        System.out.println("Resultados para Long Int con m="+m);
        System.out.println("Hubo "+erroresP+" erroresP");
        System.out.println("Hubo "+erroresNP+" erroresNP");
    }
    public static void probarBigInteger(int m, boolean verbose){
        BigInteger[] primos = ColeccionPrimos.getBigIntegerPrimeList();
        BigInteger noPrimo;
        int erroresP = 0;
        int erroresNP = 0;
        boolean rPrimo;
        boolean rNoPrimo;
        for (BigInteger primo : primos) {
            noPrimo = primo.add(new BigInteger("7"));
            rPrimo = FermatBig.esPrimo(primo,m);
            if(!rPrimo) erroresP++;
            rNoPrimo = FermatBig.esPrimo(noPrimo,m);
            if(rNoPrimo) erroresNP++;
            if(verbose)System.out.println("primo "+primo+" : "+rPrimo+", no primo "+noPrimo+": "+rNoPrimo);
        }
        System.out.println("Resultados para BigInteger con m="+m);
        System.out.println("Hubo "+erroresP+" erroresP");
        System.out.println("Hubo "+erroresNP+" erroresNP\n");
    }
    public static void probarLong(int[] ms){
        for (int m : ms) probarLong(m,false);
    }    
    public static void probarBigInteger(int[] ms){
        for (int m : ms) probarBigInteger(m,false);
    }

   
}
