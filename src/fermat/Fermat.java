package fermat;
import java.util.SortedSet;
import java.util.TreeSet;

public class Fermat {
    
    public static boolean esPrimo(int n, int m) {
        SortedSet<Integer> list = numAle(n, m);
        for (Integer b : list) {
            if (expMod(b,n-1,n) != 1)  return false; // expMod debe operar con long
            if (criterioExtendido(b,n)) return false;
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

    public static SortedSet<Integer> numAle(int n, int m) {
        SortedSet<Integer> result = new TreeSet<>();
        while (result.size() != m && result.size() != n - 1) {
            result.add((int) (Math.random() * (n - 1) + 1));
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
    private static long expMod(int base,int exp,int module){ //devuelve a^b%c
//        System.out.println("expMod("+base+","+exp+","+module+")");
        int[] binaryDigits = binaryDigits(exp);
        int[] factorModules = factorModules(base,binaryDigits,module);
        long result = 1;
        for (int factorModule : factorModules) {
            result = (result*(factorModule))%module;
//            System.out.println(result);
        }
        return result;
    }
    private static int[] binaryDigits(int a) {
        int[] factors = new int[(int)(Math.log(a)/Math.log(2))+1];
        for (int i = 0; i < factors.length; i++) {
            factors[i] = a%2;
            a = a/2;
        }
        return factors;
    }
     
    private static int[] factorModules(int base, int[] digits, int module) {
        int[] factorModules = digits;
        long lastModule = base%module;
        if(digits[0]==1) factorModules[0] = (int)lastModule;
        else factorModules[0] = 1;
        for (int i = 1; i < factorModules.length; i++) {
            lastModule= (long)(Math.pow(lastModule,2)%module);
            if(digits[i]==0) factorModules[i]=1;
            else factorModules[i] = (int) lastModule;
//            System.out.println(lastModule);
        }
        return factorModules;
    }

}
