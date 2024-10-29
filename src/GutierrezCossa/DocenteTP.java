
package GutierrezCossa;

public class DocenteTP extends Docente {
    private int horas;
    private double tarifa;

    public DocenteTP(String tipo, String nombre, String dni, String dpto, int horas, double tarifa) {
        super(tipo, nombre, dni, dpto);
        this.horas = horas;
        this.tarifa = tarifa;
    }

    @Override
    public double calcularSalario() {
        return horas * tarifa * 4;
    }
    public void setHoras(int horas){
        this.horas=horas;
    }
    public void setTarifa(double tarifa){
        this.tarifa=tarifa;
    }
    public int getHoras(){
        return horas;
    }
    public double getTarifa(){
        return tarifa;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento: " + getDpto() + ", Horas: " + horas + ", Tarifa: " + tarifa+", Salario: "+calcularSalario();
    }
}

