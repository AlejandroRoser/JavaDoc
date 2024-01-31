/**
 * Esta clase proporciona metodos de comprobacion numerica
 * @author Alejandro Roser Ramos
 * @version 1.5
 */

public class SocUtil {
    /**
     * @deprecated Este metodo fue remplazado por el metodo {@link #esCapikua(int)} en la version 1.35.
     * Este metodo comprueba si el numero introducido como parametro es capicua
     * Realiza un bucle donde comprueba que los numeros del parametro introducido esten en el mismo orden incluso invertidos.
     * @param numero Numero para comprabar si es capicua
     * @return Un boolean el valor del cual depende de si la comprobacion fue correcta o no.
     * @throws EsNegatiuEX si el numero introducido es negativo
     * @see EsNegatiuEX
     */
    public static boolean esCapicua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX("el valor no pot ser negatiu");
        }
        int numAlReves = 0;
        int còpia = numero;
        while (numero > 0) {
            numAlReves = numAlReves * 10 + numero % 10;
            numero /= 10;
        }
        return còpia == numAlReves;
    }
    /**
     * Este metodo comprueba si el numero introducido como parametro es capicua
     * Invierte el numero introducido en forma de string y comprueba que sea igual que el numero original.
     * @param numero Numero para comprabar si es capicua
     * @return Un boolean el valor del cual depende de si la comprobacion fue correcta o no.
     * @throws EsNegatiuEX si el numero introducido es negativo
     * @see EsNegatiuEX
     */
    public static boolean esCapikua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX ();
        }
        String cadNum = numero + "";
        String numAlReves = (new StringBuilder(cadNum)).reverse().toString();
        return cadNum.equals(numAlReves);
    }
    /**
     * Este metodo comprueba si un numero dado es el primo
     * Realiza un bucle donde comprueba que el numero dividido entre numeros a partir de 2 hasta el propio nunca de 0.
     * @param numero Numero para comprabar si es primo
     * @return Un boolean el valor del cual depende de si la comprobacion fue correcta o no.
     * @throws EsNegatiuEX si el numero introducido es negativo
     * @see EsNegatiuEX
     */
    public static boolean esPrimer(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        int limit = numero / 2 + 1;
        int div = 2;
        while (div < limit) {
            if (numero % div == 0) {
                return false;
            }
            div++;
        }
        return true;
    }
    /**
     * Este metodo devuelve el factorial de un numero introducido como parametro
     * Realiza un bucle donde multiplica el numero dado por todos los numeros anteriores hasta llegar al numero introducido.
     * @param numero Numero para conseguir su factorial
     * @return El factorial del numero en formato long
     * @throws EsNegatiuEX si el numero introducido es negativo
     * @see EsNegatiuEX
     * @see  <a href="http://www.sangakoo.com/es/temas/el-factorial-de-un-numero">Sangaku Maths</a>
     *
     */
    public static long getFactorial(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX("no es pot calcular el factorial d'un número negatiu");
        }
        long fact = 1L;
        while (numero > 1) {
            fact *= numero;
            numero --;
        }
        return fact;
    }
}