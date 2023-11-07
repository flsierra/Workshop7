package Tickets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Capacidad del evento (aforo): ");
        int aforo = scanner.nextInt();

        Evento evento = new Evento(aforo);

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Registrar comprador");
            System.out.println("2. Procesar siguiente compra");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de boletos a comprar: ");
                    int tiquetesAComprar = scanner.nextInt();
                    evento.registrarComprador(new Asistente(tiquetesAComprar));

                    break;
                case 2:
                    while (evento.cola.peek()!=null) {

                        evento.procesarSiguienteCompra();
                    }
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
