package listin;

/**
 * Clase alumno, es instanciable podemos crear objetos alumnos, hereda de la 
 * clase persona, de la que obtiene atributos por el super y agrega sus propios 
 * atributos curso y telefono,
 * tiene un metodo toString para devolver en consola los datos de los alumnos.
 * 
 * @author 1DAW-A Antonio Perez Terrero
 */
public class Alumno extends Persona {

    protected String curso;
    protected String telefono;

    /**
     * @param cod
     * @param dni
     * @param nombre
     * @param apellido
     * @param edad
     * @param curso
     * @param telefono
     */
    protected Alumno(
            String cod,
            String dni,
            String nombre,
            String apellido,
            int edad,
            String curso,
            String telefono) {
        super(cod, dni, nombre, apellido, edad);
        this.cod="AL";
        this.curso = curso;
        this.telefono = telefono;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
    /**
     * Metodos para mostrar los datos de los alumnos.
     * @return 
     */
    @Override
    public String toString() {
        return "\033[34mAlumno {"  
                +"DNI: "+ dni 
                +", Nombre: "+ nombre 
                +", Apellido: "+ apellido
                + ", Edad: "+edad 
                + ", Curso:"+curso
                +", Telefono: "+telefono
                + "}\033[30m";
    }

    @Override
    public String mostrar() {
        return "\033[34mAlumno {"  +"DNI: "+ dni +", Nombre: "+ nombre +", Apellido: "+ apellido
                + ", Edad: "+edad + ", Curso:"+curso+", Telefono: "+telefono+ "}\033[30m";
    }

    

}
