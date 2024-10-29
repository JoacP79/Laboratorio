
package GutierrezCossa;

class Servicio extends Trabajador {
    private String oficina;
    private double sueldo;

    public Servicio(String tipo, String nombre, String dni, String oficina, double sueldo) {
        super(tipo, nombre, dni);
        this.oficina = oficina;
        this.sueldo = sueldo;
    }
    public void setOficina(String oficina){
        this.oficina=oficina;
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }

    public String getOficina() {
        return oficina;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public double calcularSalario() {
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Oficina: " + oficina + ", Sueldo Básico: " + sueldo+", Salario: "+calcularSalario();
    }
}

