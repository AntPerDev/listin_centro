package listin;

public class Listin {

    protected final static int MAX_ENTRADAS = 100;

    public static Persona listadoCentro[];

    protected static final String COD_ALUMNO = "AL";
    protected static final String COD_PROFESOR = "PR";
    protected static final String COD_PINTERINO = "PIP";
    protected static final String COD_PLABORAL = "PL";

    public Listin() {
        listadoCentro = new Persona[MAX_ENTRADAS];
    }

    /**
     * Cargar ejemplos
     */
    public void cargaEjemplos() {
        listadoCentro[0] = new Alumno("AL", "25255255z", "Pepito", "Grillo", 44, "1DAW", "666666666");
        listadoCentro[1] = new Alumno("AL", "36366366z", "Otilio", "Pintu", 25, "2DAW", "677555888");
        listadoCentro[2] = new PFuncionario("PR", "78788788d", "Juan", "Pardo", 35, 55, "Matematicas", 2013, 1500);
        listadoCentro[3] = new PFuncionario("PR", "98855866g", "Pedro", "Sexto", 64, 02, "Matematicas", 2019, 1200);
        listadoCentro[4] = new PInterino("PIP", "69789357b", "Manuel", "Loza", 33, 01, "Matematicas", true);
        listadoCentro[5] = new PInterino("PIP", "75357571d", "Hector", "Fernandez", 53, 32, "Matematicas", false);
        listadoCentro[6] = new PersonalLaboral("PL", "45357951y", "Akiles", "Sanche", 45, "Auxiliar");
        listadoCentro[7] = new PersonalLaboral("PL", "74685215b", "Lito", "Smith", 34, "Administrativos");
    }

    @Override
    public String toString() {
        String txt, idCod;
        txt = "";

        for (int i = 0; i < MAX_ENTRADAS; i++) {
            if (listadoCentro[i] != null) {
                idCod = listadoCentro[i].getCod();
                switch (idCod) {
                    case COD_ALUMNO:
                        Alumno auxAlumno;
                        auxAlumno = (Alumno) listadoCentro[i];
                        txt = txt + "[" + i + "] " + auxAlumno.toString() + "\n";
                        break;
                    case COD_PROFESOR:
                        PFuncionario auxPFuncionario;
                        auxPFuncionario = (PFuncionario) listadoCentro[i];
                        txt = txt + "[" + i + "]" + auxPFuncionario.toString() + "\n";
                        break;
                    case COD_PINTERINO:
                        PInterino auxPInterino;
                        auxPInterino = (PInterino) listadoCentro[i];
                        txt = txt + "[" + i + "]" + auxPInterino.toString() + "\n";
                        break;
                    case COD_PLABORAL:
                        PersonalLaboral auxPLaboral;
                        auxPLaboral = (PersonalLaboral) listadoCentro[i];
                        txt = txt + "[" + i + "]" + auxPLaboral.toString() + "\n";
                        break;
                }
            }
        }
        return txt;
    }

    protected boolean insertarAlumno(Alumno alumno) {
        boolean insertado = false;

        for (int p = 0; p < MAX_ENTRADAS && !insertado; p++) {
            if (listadoCentro[p] == null) {
                listadoCentro[p] = alumno;
                insertado = true;
            }
        }
        return insertado;
    }

    public boolean insertarProfesorF(PFuncionario funcionario) {
        boolean insertado = false;

        for (int p = 0; p < MAX_ENTRADAS && !insertado; p++) {
            if (listadoCentro[p] == null) {
                listadoCentro[p] = funcionario;
                insertado = true;
            }
        }
        return insertado;
    }

    public boolean insertarProfesorI(PInterino interino) {
        boolean insertado = false;

        for (int p = 0; p < MAX_ENTRADAS && !insertado; p++) {
            if (listadoCentro[p] == null) {
                listadoCentro[p] = interino;
                insertado = true;
            }
        }
        return insertado;
    }

    public boolean insertarPersonalLaboral(PersonalLaboral laboral) {
        boolean insertado = false;

        for (int p = 0; p < MAX_ENTRADAS && !insertado; p++) {
            if (listadoCentro[p] == null) {
                listadoCentro[p] = laboral;
                insertado = true;
            }
        }
        return insertado;
    }

//  
    public boolean eliminar() {

        boolean vacio=false;
        boolean eliminado = false;
        //prueba si el listin esta vacio
        for (Persona listadoCentro1 : Listin.listadoCentro) {
            if (listadoCentro1 != null) {
                vacio = false;
                break;
            } 
        }

        if (vacio == false) {
            System.out.println("Introduzca el codigo entre corchetes [nº?] para borrar "
                    + "el registro");
            int pos = Teclado.pideUnNumeroEntero(0, 100);
            if (listadoCentro[pos] != null) {
                listadoCentro[pos] = null;
                eliminado = true;
            } else {
                eliminado = false;
            }

        }

        return eliminado;

    }
}
