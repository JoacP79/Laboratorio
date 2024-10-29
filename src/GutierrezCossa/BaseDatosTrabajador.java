
package GutierrezCossa;

class BaseDatosTrabajador {
    private Trabajador[] trabajadores;
    private int cont;

    public BaseDatosTrabajador(int N) {
        trabajadores = new Trabajador[N];
        cont = 0;
    }

    public String agregarTrabajador(Trabajador oT) {
            trabajadores[cont++] = oT;
            return "Trabajador agregado";

    }

    public Trabajador buscarTrabajador(String dni) {
        for (int i=0 ; i<cont ; i++) {
            if (trabajadores[i]!= null && trabajadores[i].getDni().equals(dni)) {
                return trabajadores[i];
            }
        }
        return null;
    }

    public String listarTrabajadores() {
        String cadena=null;
        System.out.println("DNI\tNombre\tTipo\tSalario\n");
        System.out.println("-----------------------------------\n");

        for (int i = 0; i < cont; i++) {
            if (trabajadores[i] != null) {
                cadena=cadena+trabajadores[i] + "-";
            }
        }
        return cadena;
        
    }

    public String eliminarTrabajador(String dni) {
        for (int i = 0; i < cont; i++) {
            if (trabajadores[i] != null && trabajadores[i].getDni().equals(dni)) {

                for (int j = i; j < cont - 1; j++) {
                    trabajadores[j] = trabajadores[j + 1];
                }
                trabajadores[--cont] = null; 
                return "Trabajador con DNI " + dni + " eliminado.";
            }
        }
        return "Trabajador con DNI " + dni + " no encontrado.";
    }
    public Trabajador buscarTrabajadorTipo(String Tipo) {
        for (int i=0 ; i<trabajadores.length ; i++) {
            if (trabajadores[i]!= null && trabajadores[i].getDni().equals(Tipo)) {
                return trabajadores[i];
            }
        }
        return null;
    }
}

