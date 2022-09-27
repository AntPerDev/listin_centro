package listin;

/**
 * Clase personal laboral hereda de persona heredando de ella sus datos y
 * agregando un campo nuevo,cargo. Tiene un metodo para devolver los datos de
 * l personal laboral
 * @author 1DAW-A Antonio Perez Terrero
 */
public class PersonalLaboral extends Persona {

    protected String cargo;

    /**
     * @param cod
     * @param dni
     * @param nombre
     * @param apellido
     * @param edad
     * @param cargo
     */
    protected PersonalLaboral(String cod, String dni, String nombre, String apellido, int edad, String cargo) {
        super(cod, dni, nombre, apellido, edad);
        this.cod="PL";
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
        return "\033[33m Personal Laboral {" 
                + "DNI: " + dni 
                + ", Nombre: "+ nombre
                + ", Apellido: " + apellido
                + ", Edad: "+ edad 
                + ", Cargo: " + cargo
                +"}\033[30m";
    }
    
    @Override
    public String mostrar() {
        return "\033[33m Personal Laboral {" 
                + "DNI: "+ dni 
                + ", Nombre: "+ nombre
                + ", Apellido: " + apellido
                + ", Edad: "+edad 
                + ", Cargo: " + cargo
                +"}\033[30m";
    }
    
    
}
