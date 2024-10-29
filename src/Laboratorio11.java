import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Laboratorio11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     

        System.out.print("Ingrese la cantidad de estudiantes :");
       int cantidadEstudiantes = Integer.parseInt(br.readLine());
       String[] arregloCadenas = new String[cantidadEstudiantes];
       
      for (int i = 0; i < arregloCadenas.length; i++) {
       System.out.println("Ingrese nombre del estudiante");
      String value = br.readLine();
        GuardarValor(arregloCadenas, i, value);
        
        System.out.println("Ingrese 3 notas del estudiante");
        int[] notas = new int [3];
        for (int j=0; j<notas.length; j++){
            int nota = Integer.parseInt(br.readLine());
            notas[j] = nota;
            
        int notaAlta = notas[0];
        int notaBaja = notas[0];
        int sumaNotas = 0;
        
        }
        int promedio = CalcularPromedio(notas);
        System.out.println("El promedio las notas es: " + promedio);
    }
       
private static int CalcularNotas(int [] notas){ 
        for (int nota = CalcularNotas(notas) {
            if (nota > notaAlta) {
                notaAlta = nota;
            }
            if (nota < notaBaja) {
                notaBaja = nota;
            }
            sumaNotas += nota;
            
            int notaMedia = sumaNotas / cantidadNotas;
            
        }
      return cantidadNotas / notas.length;
}
        
        
        
        
        
        
        
private static int CalcularPromedio(int [] notas){
          int sumaTotal =0;
          for (int i=0; i<notas.length; i++){
              sumaTotal += notas.length;
          }
          return sumaTotal / notas.length;
      }