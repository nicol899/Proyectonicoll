import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*
 Escribir un program que solicite ingresar 10 notas de alumnos y nos informe 
 cuantos tienen notas mayores o iguales a 7 y cuantos menores.         
  */
        Scanner input = new Scanner (System.in);

        for (int ciclo =0; ciclo<=10; ciclo++){
            System.out.println("ingrese una nota: ");
            double nota = input.nextDouble();
            if (nota>=7){

                int mayores = 0;
                mayores++;
            
            }else{
                if (nota<7){
                    System.out.println("notas menor que 7: ");
                }System.out.println(nota);

            }
            System.out.println("estudiantes con nota mayor igual a 7: ");
        }

     }
}
