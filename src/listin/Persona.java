package listin;


/**
 * Clase Persona abstracta de la que heredan todas las demás
 * implementa interfacePersona. Es la superclase.
 * @author 1DAW-A Antonio Perez Terrero
 */
public abstract class Persona implements InterfacePersona {

    //ATRIBUTOS
    protected String cod;
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected int edad;

    /**
     * Constructor de la clase abstracta Persona, no se podrá instanciar
     * @param cod codigo para el tipo de objeto que lleva el primer dato del array
     * @param dni, dni de la persona
     * @param nombre, nombre de la persona
     * @param apellido, apellido de la persona
     * @param edad, edad de la persona, en años.
     */
    public Persona(String cod, String dni, String nombre, String apellido, int edad) {
        this.darDeAlta(cod, dni, nombre, apellido, edad);
    }

    /**
     * Constructor copia//clona un objeto
     *
     * @param copia
     */
    protected Persona(Persona copia) {
        this.cod = copia.getCod();
        this.dni = copia.getDni();
        this.nombre = copia.getNombre();
        this.apellido = copia.getApellido();
        this.edad = copia.getEdad();
    }

    /**
     * Metodo dar de alta personas, no es instanciable como objeto de la clase 
     * persona
     * @param cod
     * @param dni
     * @param nombre
     * @param apellido
     * @param edad 
     */
    public void darDeAlta(String cod, String dni, String nombre, String apellido, int edad) {
        this.cod = cod;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" 
                +  ", dni:" + dni 
                + ", nombre: " + nombre
                + ", apellido:" + apellido
                + ", edad:" + edad + '}';
    }
    
    @Override
    public String mostrar() {
        return "Persona{" 
                +  ", dni:" + dni 
                + ", nombre: " + nombre
                + ", apellido:" + apellido
                + ", edad:" + edad + '}';
    }
    
    
    
        
}
