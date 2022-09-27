package listin;

/**
 *
 * @author 1DAW-A Antonio Perez Terrero
 */
public class Menu {
    /**
     * 
     * Pinta el menu, las opciones vienen en un array de cadena     *
     * @param elMenu
     */
    public static void pintaMenu(String[] elMenu) {
        final String TXT_SEPARADOR = "=========================";

        System.out.println(TXT_SEPARADOR);
        for (int i = 0; i < elMenu.length; i++) {
            System.out.println((i + 1) + elMenu[i]);
        }
        System.out.println(TXT_SEPARADOR);

    }
}
