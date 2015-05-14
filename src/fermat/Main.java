package fermat;
public class Main {
/**
 * Las pruebas programadas consisten en la ejecución del algoritmo propuesto para verificar un numero primo.
 * Se prueban varias cantidades de candidatos aleatorios (testigos). Estas cantidades son los valores de ms.
 * 
 * En cada prueba (cada m) se verifican algo más 1600 primos y la misma cantidad de numeros compuestos
 * En la implementación con BigInteger se prueban algunos más.
 * En la implementación con BigInteger el segundo criterio del algoritmo está comentado
 * porque la potencia de BigInteger (BigInteger.pow()) es muy lenta. Este cambio
 * no pparece alterar demasiado los resultados
 * 
 * En la salida se llama erroresP a la cantidad de primos interpretados como 
 * compuestos (debería ser 0 salvo desbordamiento)
 * erroresNP es la cantidad de numeros compuestos interpretados como primos
 * 
 * Para un unico m dado,
 * Pruebas.probarLong(m,true) o Pruebas.probarBigInteger(m,true) 
 * muestra el resultado para cada primo
 **/
    public static void main(String[] args) {
        int[] ms = {1,2,3,4,5,10,15,20,30,40,60,85,150};
        Pruebas.probarLong(ms);
        Pruebas.probarBigInteger(ms);
    }
}

