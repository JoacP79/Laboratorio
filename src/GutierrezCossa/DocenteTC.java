
package GutierrezCossa;

public class DocenteTC extends Docente {
    private double sueldo;

    public DocenteTC(String tipo, String nombre, String dni, String dpto, double sueldo) {
        super(tipo, nombre, dni, dpto);
        this.sueldo = sueldo;
    }

    @Override
    public double calcularSalario() {
        return sueldo - (sueldo * 0.15);
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    public double getSueldo(){
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento: " + getDpto() + ", Sueldo: " + sueldo+", Salario: "+calcularSalario();
    }
}

