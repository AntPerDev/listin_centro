package listin;

/**
 * Subclase instanciable de profesor, crea objetos profesores funcionarios
 * obtiene atributos de las superclases a través de super.
 * obtiene automaticamente el salario dependiendo de la fecha en que aprobó
 * sus oposiciones, sueldo base 1000. 10 € mas por año trabajado.
 * @author 1DAW-A Antonio Perez Terrero
 */
public final class PFuncionario extends Profesor {

    protected int anioEsAprobado;
    protected int salario;

    /**
     * @param cod
     * @param dni
     * @param nombre
     * @param apellido
     * @param edad
     * @param idProfesor
     * @param especialidad
     * @param anioEsAprobado
     * @param salario
     */
    public PFuncionario(
            String cod,
            String dni,
            String nombre,
            String apellido,
            int edad,
            int idProfesor,
            String especialidad,
            int anioEsAprobado,
            int salario) {
        super(cod, dni, nombre, apellido, edad, idProfesor, especialidad);
        this.cod="PR";
        this.anioEsAprobado = anioEsAprobado;
        this.salario = salarioMensual();
    }

    public int getAnioEsAprobado() {
        return anioEsAprobado;
    }

    public void setAnioEsAprobado(int anioEsAprobado) {
        this.anioEsAprobado = anioEsAprobado;
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
    
    private int salarioMensual() {
        return Auxiliar.getSueldoBase() + 10 * (Auxiliar.getAnhoActual()
                -this.anioEsAprobado);
    }
    
    /**
     * Metodos para devolver cadena con los datos de los profesores
     * funcionarios para poder imprimerilos
     * @return 
     */
    @Override
    public String toString() {
        return "\033[32m Prof. Funcionario {" 
                + "DNI: "+ dni 
                +", Nombre: "+ nombre
                +", Apellido: " + apellido
                +", Edad: "+edad 
                +", Año que aprobó:" + anioEsAprobado 
                +", Sueldo:" + salario
                +"}\033[30m";
    }
    
    @Override
    public String mostrar() {
        return "\033[30m Prof. Funcionario {" 
                +"DNI: "+ dni
                +", Nombre: "+ nombre
                +", Apellido: " + apellido
                +", Edad: "+edad 
                +", Año que aprobó:" + anioEsAprobado
                +", Sueldo:" + salario
                +"}\033[30m";
    }
    
    
    
}
