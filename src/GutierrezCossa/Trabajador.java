
package GutierrezCossa;

public abstract class Trabajador {
    private String tipo;
    private String nombre;
    private String dni;

    public Trabajador(String tipo, String nombre, String dni) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.dni = dni;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDni(String dni){
        this.dni=dni;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Nombre: " + nombre + ", DNI: " + dni;
    }
}


