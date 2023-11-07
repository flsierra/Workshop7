package Reproductor;

import java.util.LinkedList;
import java.util.Queue;

public class ColaReproduccion {
    private Queue<String> cola;
    public ColaReproduccion(){
        cola=new LinkedList<>();
    }
    public void agregarCancion(String cancion) {
        cola.add(cancion);
        System.out.println("cacion agregada a la cola: " + cancion);
    }
    public  void mostrarCanciones(){
        System.out.println("Canciones en cola: "+cola);
    }

    public void eliminarCancion(String cancion)  {
        if (cola.contains(cancion)) {
            cola.remove(cancion);
            System.out.println("cancion elinada de la cola: " + cancion);
        }else {
            System.out.println("La canción no está en la cola de reproducción.");
        }
    }
}
