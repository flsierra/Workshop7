package Reproductor;

import Editortext.TextEditor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ColaReproduccion colaReproduccion = new ColaReproduccion();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int opcion;

        do {
            System.out.println("Bienvenido al menu");
            System.out.println("1. Agregar canción a la cola");
            System.out.println("2. Reproducir canciones en la cola");
            System.out.println("3. Eliminar canción de la cola");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opción");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la canción: ");
                    scanner.nextLine();
                    String cancion = scanner.nextLine();
                    colaReproduccion.agregarCancion(cancion);
                    break;
                case 2:
                    colaReproduccion.mostrarCanciones();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la canción a eliminar: ");
                    scanner.nextLine();
                    String cancionEliminar = scanner.nextLine();
                    colaReproduccion.eliminarCancion(cancionEliminar);
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        }while (opcion != 4);
        scanner.close();
}
}