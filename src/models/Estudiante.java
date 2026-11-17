package models;

public class Estudiante implements Comparable<Estudiante> {
    private String codigo;
    private String nombre;
    private int edad;
    private Double nota;
    private String carrera;

//CVONSTRUCTORES


    public Estudiante() {
    }

    public Estudiante(String codigo, String nombre, int edad, Double nota, String carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.carrera = carrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante [El codigo es: " + codigo + ", El nombre es: " + nombre + ", La edad es: " + edad + ", La nota es: " + nota
                + ", La carrera es: " + carrera + "]";
    }
    //Orden Natural orden acendente por nombre o codigo
     @Override
    public int compareTo(Estudiante e1) {
            return this.codigo.compareTo(e1.codigo); //Orden natural por codigo
                    
    }

    
}
