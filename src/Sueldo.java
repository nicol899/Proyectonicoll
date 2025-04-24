import java.util.Scanner;

public class Sueldo {

    public static void main(String[] args) {
    
        //Ingresar el sueldo de una persona, si supera los 3000 dolares mostrar un
        //mensaje en pantalla indicando que debe abonar impuestos.

        Scanner input=new Scanner (System.in);
        System.out.println("ingrese su saldo: ");
        double sueldo = input.nextDouble();

        if(sueldo>3000){
            System.out.println("usted debe abonar impuestos");
        }

    }
}
