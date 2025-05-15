import java.util.Scanner;

public class NumerosTresCifras {
    public static void main(String[] args) {
        //confeccionar un programa que permita cargar un numero entero positivo
        //de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras, 
        //mostrar un mensaje de error si el numero de cifras es mayor.

        Scanner input = new Scanner (System.in);

        System.out.println("ingrese un nummero de uno a tres cifras: ");
        int numero= input.nextInt();

        if (numero>=0 && numero<10){
            System.out.println("el numero es de una cifra");
        
        }else{

            if (numero>9 && numero<100){
                System.out.println("el numero es de dos cifras");

            }else{

                if(numero>99 && numero<1000){
                     System.out.println("el numero es de tres cifras");

                }else{

                }

            }

            }
        }
    }

