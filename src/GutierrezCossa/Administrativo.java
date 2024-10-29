
package GutierrezCossa;

public class Administrativo extends Trabajador {
    private String oficina;
    private String cargo;
    private double sueldo;

    public Administrativo(String tipo,String nombre, String dni, String oficina, String cargo, double sueldo) {
        super(tipo, nombre, dni);
        this.oficina = oficina;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    public void setOficina(String oficina){
        this.oficina=oficina;
    }
    public void setCargo(String cargo){
        this.cargo=cargo;
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    public String getOficina() {
        return oficina;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public double calcularSalario() {
        return sueldo - (sueldo * 0.12);
    }

    @Override
    public String toString() {
        return super.toString() + ", Oficina: " + oficina + ", Cargo: " + cargo + ", Sueldo Básico: " + sueldo+", Salario: "+calcularSalario();
    }
}

