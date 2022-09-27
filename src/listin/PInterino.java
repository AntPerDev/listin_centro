package listin;

/**
 * Es una clase que hereda de profesor y no puede ser usada para usar mas 
 * herencias. Es una clase final.
 * Obtiene sus atributos de las clases padre y añade el campo tiene vacante
 * @author 1DAW-A Antonio Perez Terrero
 */
public final class PInterino extends Profesor {

    protected boolean tieneVacante;

    /**
     * @param cod
     * @param dni
     * @param nombre
     * @param apellido
     * @param edad
     * @param idProfesor
     * @param especialidad
     * @param tieneVacante
     */
    public PInterino(
            String cod, 
            String dni,
            String nombre,
            String apellido, 
            int edad,
            int idProfesor,
            String especialidad,
            boolean tieneVacante) {
        super(cod, dni, nombre, apellido, edad, idProfesor, especialidad);
        this.cod="PIP";
        this.tieneVacante = tieneVacante;
    }

    public boolean isTieneVacante() {
        return tieneVacante;
    }

    public void setTieneVacante(boolean tieneVacante) {
        this.tieneVacante = tieneVacante;
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
     * Devuelve cadena con los datos de los objetos.
     * @return 
     */
    @Override
    public String toString() {
        return "\033[31m Prof. Interino {" 
                + "DNI: "+ dni 
                + ", Nombre: " + nombre
                + ", apellidos: " + apellido
                + ", edad: "+ edad
                + ", idProfesor: "+idProfesor
                + ", especialidad: "+ especialidad
                + ", tieneVacante: " + tieneVacante 
                +  " }\033[30m";
    }
    
    @Override
    public String mostrar() {
        return "\033[31m Prof. Interino {" 
                + ", DNI: "+ dni 
                + ", Nombre: " + nombre
                + ", apellidos: " + apellido
                + ", edad: "+ edad
                + ", idProfesor: "+idProfesor
                + ", especialidad: "+ especialidad
                + ", tieneVacante: " + tieneVacante
                + "}\033[30m";
    }
    
}
