import java.util.Scanner;

public class PromedioNumerosArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("ingrese el tamaño del array: ");
        int tamaño = input.nextInt();

        int [] numeros = new int [tamaño];
        System.out.println("ingrese los valores del array: ");
        for (int i = 0; i< numeros.length; i++){
            numeros [i] = input.nextInt();
        }
        int suma = 0 ; 
        for (int i = 0; i< numeros.length; i++) {
            suma += numeros[i];
        }
        int promedio = suma / tamaño;
        System.out.println("la suma de los numeros del array es: "+ suma );
        System.out.println("el promedio de los numeros del array es: " + promedio  );

        input.close();
    }
}