
package GutierrezCossa;

public abstract class Docente extends Trabajador {
    private String dpto;

    public Docente(String tipo, String nombre, String dni, String dpto) {
        super(tipo, nombre, dni);
        this.dpto = dpto;
    }
    public abstract double calcularSalario();
    
    public void setDpto(String dpto){
        this.dpto=dpto;
    }
    
    public String getDpto() {
        return dpto;
    }
    
    public String toString(){
        return "tipo: "+getTipo()+", nombre: "+getNombre()+", dni: "+getDni()+", dpto: "+dpto;
    }
}

