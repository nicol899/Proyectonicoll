import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("ingrese el primer numero");
        int inicio = input.nextInt();
        System.out.println("ingrese el segundo numero");
        int fin = input.nextInt();
        System.out.println("el primer numero es" + inicio+ "el segundo numero es"+fin);

    }
}
