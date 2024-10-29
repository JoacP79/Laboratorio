
package GutierrezCossa;
import java.io.*;
public class PruebaTrabajador {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BaseDatosTrabajador baseDatos = new BaseDatosTrabajador(10);

        // Agregar algunos trabajadores
        baseDatos.agregarTrabajador(new DocenteTC("Docente de tiempo completo","Freddy", "12345", "Ingenieria", 2800));
        baseDatos.agregarTrabajador(new DocenteTP("Docente de tiempo parcial","Pedro", "67890", "Matemáticas", 15, 20));
        baseDatos.agregarTrabajador(new Administrativo("Administrativo","Rolando", "45321", "Contabilidad", "Director", 2500));
        baseDatos.agregarTrabajador(new Servicio("De servicio","Wilson", "67321", "Mantenimiento", 800));

        // Menú para interactuar
        while (true) {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Listar todos los trabajadores");
            System.out.println("2. Buscar trabajador por DNI");
            System.out.println("3. Eliminar trabajador por DNI");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = br.readLine();

            switch (opcion) {
                case "1":
                    System.out.println(baseDatos.listarTrabajadores());
                    break;
                case "2":
                    String dni = "45321";
                    Trabajador trabajador = baseDatos.buscarTrabajador(dni);
                    if (trabajador != null) {
                        System.out.println(trabajador.toString() + ", Salario: " + trabajador.calcularSalario());
                    } else {
                        System.out.println("Trabajador no encontrado.");
                    }
                    break;
                case "3":
                    String dniEliminar = "67321";
                    System.out.println(baseDatos.eliminarTrabajador(dniEliminar));
                    break;
                case "4":
                    System.out.println("Saliendo del programa...");
                    return;
            }
        }
    }
}

