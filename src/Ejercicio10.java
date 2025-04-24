import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
         /*
De un operario se conoce su sueldo y los años de antiguedad. Se pide
confeccionar un programa que lea los datos de entrada e informe:
a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.
c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.
*/
        Scanner input = new Scanner (System.in);
        System.out.println("ingrese su sueldo: ");
        float sueldo = input.nextFloat();
        System.out.println("ingrese cuantos años tiene de antiguedad: ");
        float antiguedad= input.nextFloat();

        input.close();

        if(sueldo<500 && antiguedad>10){
            double aumento = sueldo*0.2;
            double sueldoFinal= sueldo + aumento; 
            System.out.println("se le atorgo un aumento del 20% y su sueldo es de: " + sueldoFinal);
        }else{
            if (sueldo<500 && antiguedad<10){
                double aumento = sueldo*0.05;
                double sueldofinal = sueldo + aumento;
                System.out.println("se le atorgo el aumento del 5% y su sueldo es de:" + sueldofinal);

            }else{
                if(sueldo>=500){
                    System.out.println("se le atorgo un aumento del 0% y su sueldo es de: " + sueldo);
                }else{
                    System.out.println("error datos no coinciden???");
                }
            }

        }
    }
}
