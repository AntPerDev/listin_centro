package listin;

import java.util.Calendar;
//import static perez_terrero_antonio_pro_tarea6.Listin.listadoCentro;

/**
 * Clase abstracta auxiliar no instanciable, contiene la lógica de la
 * aplicación, asi como los campos y métodos necesarios
 *
 * @author 1DAW-A Antonio Perez Terrero
 */
public abstract class Auxiliar {

    private static int anioActual;

    private static final int SUELDOBASE = 1000;

    private static int opcionMenuPpal;

    private static String[] menuPpal = {
        ". Mostrar todo el listin",
        ". Alta en el listín",
        ". Baja en el listín",
        ". Salir de la aplicación"
    };

    private static final int MOSTRAR = 1;
    private static final int ALTA = 2;
    private static final int BAJA = 3;
    private static final int SALIR = 4;

    private static String[] tipo = {
        ". Alumno",
        ". Profesor Funcionario",
        ". Profesor Interino",
        ". Personal Laboral",
        ". Terminar"
    };

    protected static final String COD_ALUMNO = "AL";
    protected static final String COD_PROFESOR = "PR";
    protected static final String COD_PINTERINO = "PI";
    protected static final String COD_PLABORAL = "PL";

    private static final int ALUMNO = 1;
    private static final int PROFESOR = 2;
    private static final int PROFESORINTERINO = 3;
    private static final int PLABORAL = 4;
    private static final int TERMINAR = 5;

    //private static Listin listin;
    public static int getAnhoActual() {

        Calendar cal = Calendar.getInstance();
        anioActual = cal.get(Calendar.YEAR);
        return anioActual;
    }

    public static int getSueldoBase() {
        return SUELDOBASE;
    }

    public static void principal(Listin listadoCentro) {
        boolean vacio;

        do {
            System.out.println("Listin del centro.-");
            Menu.pintaMenu(menuPpal);
            System.out.println("Elige una opción (1-4)");
            opcionMenuPpal = Teclado.pideUnNumeroEntero(ALUMNO, SALIR);

            switch (opcionMenuPpal) {

                case MOSTRAR:
                    //Verfica que el listin no esta vacio y lo muestra 
                    //caso contrario  muestra "Listin vacio"
                    vacio = true;
                    for (Persona listadoCentro1 : Listin.listadoCentro) {
                        if (listadoCentro1 != null) {
                            vacio = false;
                            System.out.println(listadoCentro.toString());
                            break;
                        }
                    }

                    if (vacio == true) {
                        System.err.println("Listin Vacio");
                    }

                    //System.out.println(listadoCentro.toString());
                    break;
                case ALTA:
                    insertarEntrada();
                    break;
                case BAJA:
                    System.out.println("Registros a eliminar");
                    System.out.println(listadoCentro.toString());
                    if (listadoCentro.eliminar()) {
                        System.out.println("Retistro eliminado");
                    } else {
                        System.out.println("No se pudo borrar");
                    }
                    break;
                case SALIR:
                    System.out.println("Hasta pronto!");
                default:
                    break;
            }
        } while (opcionMenuPpal != SALIR);

    }

    /**
     * Inserta
     */
    public static void insertarEntrada() {
        boolean insertado;
        String cod;

        String dni;
        String nombre;
        String apellido;
        int edad;
        int idProfesor;
        int anioEsAprobado;
        int salario = 1000;
        String especialidad;
        boolean tieneVacante;
        String curso;
        String cargo;
        String telefono;

        int opcionTipo;
        //Elige tipo de objeto a insertar

        Menu.pintaMenu(tipo);
        opcionTipo = Teclado.pideUnNumeroEntero(ALUMNO, TERMINAR);

        switch (opcionTipo) {
            case ALUMNO:
                Alumno alumno;
                String titulo = "Insertar alumno";
                System.out.println(titulo);
                cod = "AL";
                System.out.println("DNI: ");
                dni = Teclado.pideUnaCadena();
                System.out.println("Nombre: ");
                nombre = Teclado.pideUnaCadena();
                System.out.println("Apellidos: ");
                apellido = Teclado.pideUnaCadena();
                System.out.println("Edad: ");
                edad = Teclado.pideUnNumeroEntero(0, 100);
                System.out.println("Curso: ");
                curso = Teclado.pideUnaCadena();
                System.out.println("Telefono: ");
                telefono = Teclado.pideUnaCadena();
                alumno = new Alumno(cod, dni, nombre, apellido, edad, curso, telefono);

                insertado = false;

                for (int p = 0; p < 100 && !insertado; p++) {
                    if (Listin.listadoCentro[p] == null) {
                        Listin.listadoCentro[p] = alumno;
                        insertado = true;
                    }
                }

                if (insertado) {
                    System.out.println("Alumno insertado");
                } else {
                    System.out.println("No se pudo insertar el alumno");
                }
                break;
            case PROFESOR:
                PFuncionario profesor;

                titulo = "Insertar Profesor";
                System.out.println(titulo);
                cod = "PR";
                System.out.println("DNI: ");
                dni = Teclado.pideUnaCadena();
                System.out.println("Nombre: ");
                nombre = Teclado.pideUnaCadena();
                System.out.println("Apellidos: ");
                apellido = Teclado.pideUnaCadena();
                System.out.println("Edad: ");
                edad = Teclado.pideUnNumeroEntero(0, 100);
                System.out.println("idProfesor: ");
                idProfesor = Teclado.pideUnNumeroEntero(0, 100);
                System.out.println("Especialidad: ");
                especialidad = Teclado.pideUnaCadena();
                System.out.println("Año en que aprobó entre 1900 y 2019: ");
                anioEsAprobado = Teclado.pideUnNumeroEntero(1900, 2019);
                profesor = new PFuncionario(cod, dni, nombre, apellido, edad,
                        idProfesor, especialidad, anioEsAprobado, salario);

                insertado = false;

                for (int p = 0; p < 100 && !insertado; p++) {
                    if (Listin.listadoCentro[p] == null) {
                        Listin.listadoCentro[p] = profesor;
                        insertado = true;
                    }
                }

                if (insertado) {
                    System.out.println("Profesor insertado");
                } else {
                    System.out.println("No se pudo insertar el profesor");
                }
                break;
            case PROFESORINTERINO:
                PInterino interino;

                titulo = "Insertar Profesor Interino";
                System.out.println(titulo);
                cod = "PIP";
                System.out.println("DNI: ");
                dni = Teclado.pideUnaCadena();
                System.out.println("Nombre: ");
                nombre = Teclado.pideUnaCadena();
                System.out.println("Apellidos: ");
                apellido = Teclado.pideUnaCadena();
                System.out.println("Edad: ");
                edad = Teclado.pideUnNumeroEntero(0, 100);
                System.out.println("idProfesor: ");
                idProfesor = Teclado.pideUnNumeroEntero(0, 100);
                System.out.println("Especialidad: ");
                especialidad = Teclado.pideUnaCadena();
                System.out.println("Tiene vacante: (si/no)");
                tieneVacante = Teclado.pideUnSiNo();
                interino = new PInterino(cod, dni, nombre, apellido, edad,
                        idProfesor, especialidad, tieneVacante);

                insertado = false;

                for (int p = 0; p < 100 && !insertado; p++) {
                    if (Listin.listadoCentro[p] == null) {
                        Listin.listadoCentro[p] = interino;
                        insertado = true;
                    }
                }

                if (insertado) {
                    System.out.println("Profesor Interino insertado");
                } else {
                    System.out.println("No se pudo insertar el profesor interino");
                }
                break;
            case PLABORAL:
                PersonalLaboral laboral;

                titulo = "Insertar Personal Laboral";
                System.out.println(titulo);
                cod = "PL";
                System.out.println("DNI: ");
                dni = Teclado.pideUnaCadena();
                System.out.println("Nombre: ");
                nombre = Teclado.pideUnaCadena();
                System.out.println("Apellidos: ");
                apellido = Teclado.pideUnaCadena();
                System.out.println("Edad: ");
                edad = Teclado.pideUnNumeroEntero(0, 100);
                System.out.println("Cargo: ");
                cargo = Teclado.pideUnaCadena();
                laboral = new PersonalLaboral(cod, dni, nombre, apellido, edad,
                        cargo);
                insertado = false;

                for (int p = 0; p < 100 && !insertado; p++) {
                    if (Listin.listadoCentro[p] == null) {
                        Listin.listadoCentro[p] = laboral;
                        insertado = true;
                    }
                }

                if (insertado) {
                    System.out.println("Personal laboral");
                } else {
                    System.out.println("No se pudo insertar el personal laboral");
                }
                break;
            default:
                //  menu(listin); //Volver al menu ppal
                break;
        }

    }

}
