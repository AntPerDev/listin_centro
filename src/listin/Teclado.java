package listin;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 1DAW-A Antonio Perez Terrero
 */
public class Teclado {

    /**
     * Metodo pide un numero entero por teclado, comprueba que la entrada
     * estaEnRango entre elMinimo y elMaximo, si no estaEnRango, vuelve a pedir
     * entero si entero estaEnRango, devuelve entero
     *
     * @param minimo
     * @param maximo
     * @return
     */
    public static int pideUnNumeroEntero(int minimo, int maximo) {

        //Declara variables
        int entero;
        int elMinimo;
        int elMaximo;

        //flag
        boolean noValido;

        //Inicializa variables
        entero = 0;

        //Captura teclado
        Scanner teclado;
        teclado = new Scanner(System.in);

        //Recibe los valores
        elMinimo = minimo;
        elMaximo = maximo;

        do {
            noValido = false;

            try {
                entero = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Error en la entrada\n"
                        + "vuelve a intentarlo");
                noValido = true;
            } finally {
                teclado.nextLine();
            }

            if (noValido == false) {
                if (!estaEnRango(entero, elMinimo, elMaximo)) {
                    System.err.println("Fuera de rango "
                            + "(" + elMinimo + "," + elMaximo + ")\n"
                            + "vuelve a intentarlo");
                    noValido = true;
                }
            }
        } while (noValido);
        return entero;
    }

    /**
     * Metodo recibe un entero, un minimo y un maximo, devuelve verdadero si el
     * entero esta entre el minimo y el maximo devuelve falso si el entero no
     * esta dentro del rango
     *
     * @param entero
     * @param minimo
     * @param maximo
     * @return
     */
    public static boolean estaEnRango(int entero, int minimo, int maximo) {

        boolean estaEnRango;
        int elEntero = entero;
        int elMinimo = minimo;
        int elMaximo = maximo;

        estaEnRango = !(elEntero < elMinimo || elEntero > elMaximo);

        return estaEnRango;
    }

       public static String pideUnaCadena() {
        String cadena="";
        boolean repetir;
        //Captura teclado
        Scanner teclado;
        teclado = new Scanner(System.in);

        do {
            repetir = false;
        
            try {
                cadena = teclado.next();
            } catch (Exception e) {
                System.out.println("Error");
                repetir = true;
            } finally {
                teclado.nextLine();
            }
        } while (repetir);

        return cadena;

    }
       
       public static boolean pideUnSiNo(){
           boolean opcion=false;
           boolean repetir;
           String cadena = null;
           
           Scanner teclado;
           teclado = new Scanner(System.in);
           
           do {
               repetir=false;
               try{
                   cadena = teclado.next();
               }catch(Exception e){
                   System.err.println("Error");
               }finally{
                   teclado.nextLine();
               }
               
               opcion = "Si".equals(cadena) 
                       || "s".equals(cadena) 
                       || "S".equals(cadena) 
                       || "SI".equals(cadena);
               
           } while (repetir);
           
                   
           
           
           
           return opcion;
       
       }
}
