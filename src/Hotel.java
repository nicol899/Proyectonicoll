import java.util.Scanner;

public class Hotel {
    // Declaración de matrices y arrays
    static String[][] nombresClientes = new String[2][5]; // 2 pisos, 5 habitaciones por piso, matriz que almacena nombre de los clientes
    static double[][] precioHabitaciones = { //Matriz que define los precios de las habitaciones, separadas por piso
        {35000, 35000, 35000, 35000, 35000}, // Precios del primer piso
        {40000, 40000, 40000, 40000, 40000}  // Precios del segundo piso
    };
    static int[][] nochesReservadas = new int[2][5]; // Matriz para noches reservadas

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        //menu u opciones que serán elegidas por el usuriario, mediante un a orden dada por consola
        while (!salir) {
            System.out.println("\n--- Sistema de Reservas de Hotel ---");
            System.out.println("1. Registrar Reserva");
            System.out.println("2. Cancelar Reserva");
            System.out.println("3. Generar Reporte");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    registrarReserva(sc);
                    break;
                case 2:
                    cancelarReserva(sc);
                    break;
                case 3:
                    generarReporte();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }

    public static void registrarReserva(Scanner sc) {
        System.out.print("Ingrese el nombre del cliente: ");
        sc.nextLine(); // Limpiar el buffer después de leer un número
        String nombreCliente = sc.nextLine();
    
        System.out.print("Ingrese el número de piso (1 o 2): ");
        int piso = sc.nextInt();
        if (piso < 1 || piso > 2) {
            System.out.println("Error: El piso ingresado no es válido. Debe ser 1 o 2.");
            return;
        }
        int convertirPiso = piso - 1; // Convertir piso ingresado a índice de la matriz
    
        System.out.print("Ingrese el número de habitación desde 101-105 para el primer piso, y 201-205 para el segundo piso ");
        int habitacion = sc.nextInt();
    
        // Validar rango de habitaciones según el piso
        if ((piso == 1 && (habitacion < 101 || habitacion > 105)) || 
            (piso == 2 && (habitacion < 201 || habitacion > 205))) {
            System.out.println("Error: El número de habitación no es válido. Debe ser entre 201-205 para el piso 2.");
            return;
        }
    
        // Convertir número de habitación a índice de la matriz
        int convertirHabitacion;
        if (piso == 1) {
            convertirHabitacion = habitacion - 101; // Habitaciones del piso 1 (101-105)
        } else {
            convertirHabitacion = habitacion - 201; // Habitaciones del piso 2 (201-205)
        }
    
        // Verificar si la habitación ya está ocupada
        if (nombresClientes[convertirPiso][convertirHabitacion] != null) {
            System.out.println("Error: La habitación " + habitacion + " ya está ocupada. Por favor, elija otra habitación.");
            return;
        }
    
        System.out.print("Ingrese el número de noches reservadas: ");
        int noches = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer después de leer un número
    
        // Guardar la reserva
        nombresClientes[convertirPiso][convertirHabitacion] = nombreCliente;
        nochesReservadas[convertirPiso][convertirHabitacion] = noches;
    
        System.out.println("Reserva registrada para " + nombreCliente + " en la habitación " + habitacion + ".");
        double Total = noches * precioHabitaciones[piso - 1][convertirHabitacion];
      System.out.println("el precio a pagar por su reverva es : "+ Total);
    

    }

    public static void cancelarReserva(Scanner sc) {
        System.out.print("Ingrese el número de piso (1 o 2): ");
        int piso = sc.nextInt();
        if (piso < 1 || piso > 2) {
            System.out.println("Error: El piso ingresado no es válido. Debe ser 1 o 2.");
            return;
        }
        int indicePiso = piso - 1; // Convertir piso ingresado a índice de la matriz
    
        System.out.print("Ingrese el número de habitación: ");
        int habitacion = sc.nextInt();
    
        // Validar rango de habitaciones según el piso
        if ((piso == 1 && (habitacion < 101 || habitacion > 105)) || 
            (piso == 2 && (habitacion < 201 || habitacion > 205))) {
            System.out.println("Error: El número de habitación no es válido. Debe estar entre 101-105 para el piso 1 o 201-205 para el piso 2.");
            return;
        }
    
        // Convertir el número de habitación a índice de la matriz
        int indiceHabitacion;
        if (piso == 1) {
            indiceHabitacion = habitacion - 101; // Habitaciones del piso 1: 101 a 105 se convierten en índices 0 a 4
        } else {
            indiceHabitacion = habitacion - 201; // Habitaciones del piso 2: 201 a 205 se convierten en índices 0 a 4
        }
        if (nombresClientes[indicePiso][indiceHabitacion] == null) {
            System.out.println("Error: La habitación " + habitacion + " está vacía y no se puede cancelar.");
            return;
        }
        // Cancelar la reserva
        nombresClientes[indicePiso][indiceHabitacion] = null;
        nochesReservadas[indicePiso][indiceHabitacion] = 0;
    
        System.out.println("Reserva cancelada en la habitación " + habitacion + ".");
    }
    
    public static double calcularTotal(int piso, int habitacion) {
        return precioHabitaciones[piso][habitacion] * nochesReservadas[piso][habitacion];
    }

        // reportar reservas
        
        public static void generarReporte() {
        System.out.println("\n--- Reporte de Reservas ---");
        
        System.out.println("\nHabitaciones ocupadas:");
        for (int i = 0; i < nombresClientes.length; i++) {
            System.out.println("Piso " + (i + 1) + ":");
            for (int j = 0; j < nombresClientes[i].length; j++) {
                if (nombresClientes[i][j] != null) { // Si la habitación está ocupada
                    int numeroHabitacion = (i == 0 ? 101 + j : 201 + j); // Convertir índice a número de habitación
                    System.out.println("  Habitación " + numeroHabitacion + ": Ocupada por " + nombresClientes[i][j]);
                }
            }
        }

        System.out.println("\nHabitaciones disponibles:");
        for (int i = 0; i < nombresClientes.length; i++) {
            System.out.print("Piso " + (i + 1) + ": ");
            for (int j = 0; j < nombresClientes[i].length; j++) {
                if (nombresClientes[i][j] == null) {
                    System.out.print((101 + j) + " ");
                }
            }
            System.out.println();
        }
    }
}
