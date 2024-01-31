/**
 * Esta clase demuestra los posibles usos del metodo esCapikua junto con la excepcion EsNegaituEX
 * @author Alejandro Roser Ramos
 * @version 1.5
 */
public class Principal {
    public static void main(String[] args) {
        try {
            System.out.println("12345 és capicua: " + SocUtil.esCapikua(12345));
            System.out.println("1221 és capicua: " + SocUtil.esCapicua(1221));
            System.out.println("1234321 és capicua: " + SocUtil.esCapikua(1234321));
        } catch (EsNegatiuEX ex) {
            System.out.println(ex.getMessage());
        }
    }
}
