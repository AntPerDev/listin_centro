package listin;

/**
 * Clase abstracta Profesor, no puede ser instanciada, hereda de Persona
 * que es la superclase de la que obtiene sus atributos por el super 
 * añade sus propios atributos e implementa el interface profesor. 
 * @author 1DAW-A Antonio Perez Terrero
 */
public abstract class Profesor extends Persona  implements InterfaceProfesor {

    protected int idProfesor;
    protected String especialidad;
    protected int ingreso; // Año de ingreso

    /**
     * @param cod
     * @param dni
     * @param nombre
     * @param apellido
     * @param edad
     * @param idProfesor
     * @param especialidad
     */
    public Profesor( String cod,
            String dni,
            String nombre,
            String apellido, 
            int edad,
            int idProfesor,
            String especialidad) {
        super(cod, dni, nombre, apellido, edad);
        this.idProfesor = idProfesor;
        this.especialidad = especialidad;
    }
    /**
     * Calcula el salario mensual de profesores interinos
     * @return 
     */
    private int salarioMensual() {
        return Auxiliar.getSueldoBase() + 10 * (Auxiliar.getAnhoActual() - this.ingreso);
    }


    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    @Override
    public String getCod() {
        return cod;
    }

    @Override
    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Profesor{" 
                + " DNI: " + dni 
                + ", Nombre: "+ nombre
                + ", Apellido: " + apellido
                + ", Edad: "+ edad 
                + ", idProfesor=" + idProfesor 
                + ", especialidad=" + especialidad 
                + ", ingreso=" + ingreso +"}";
    }
     
    @Override
    public String mostrar() {
        return "Profesor{" 
                + " DNI: " + dni 
                + ", Nombre: "+ nombre
                + ", Apellido: " + apellido
                + ", Edad: "+ edad 
                + ", idProfesor=" + idProfesor 
                + ", especialidad=" + especialidad 
                + ", ingreso=" + ingreso +"}";
    }
     
    
    
}
