/**
 * Esta clase proporciona la excepion EsNegatiuEX
 * @author Alejandro Roser Ramos
 * @version 1.5
 *
 */
public class EsNegatiuEX extends Exception {
    /**
     * Este metodo toma como valor un mensaje de error informando de que el valor no puede ser negativo, esta destinado a ser usado en casos donde el numero introducido no debe ser negativo
     *
     */
    public EsNegatiuEX() {
        super("el valor no pot ser negatiu");
    }
    /**
     * Este metodo toma como valor un mensaje de error introducido como parametro, esta destinado a ser usado en casos donde el numero introducido no debe ser negativo
     *
     * @param msg Mensaje que se quiere mostrar
     *
     */
    public EsNegatiuEX(String msg) {
        super(msg);
    }
}