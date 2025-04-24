import java.util.Scanner;

public class TabladeMultiplicar {
    //Escribe un programa que genere la tabla de multiplicar de un numero ingresado por el usuario utlizando un clclo for.
    public static void main(String[] args) {
        int numero;
        try (// se crea el Scanner.
        Scanner input = new Scanner (System.in)){
            System.out.println("ingrese un numero");
            numero= input.nextInt();
            ///cerramos scanner. 
        }
        for (int i =1; i<=10; i++){

            int resultado= numero*i;

            System.out.println(numero + "*" + i + "=" + resultado);
        }
    }
}
