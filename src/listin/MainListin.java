package listin;

/**
 *
 * @author 1DAW-A Antonio Perez Terrero
 */
public class MainListin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Listin listadoCentro;

        listadoCentro = new Listin();
        
        //Descomentar la proxima linea para cargar ejemplos
        listadoCentro.cargaEjemplos();
        

        Auxiliar.principal(listadoCentro);

    }

}
