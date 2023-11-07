package Tickets;

import java.util.LinkedList;
import java.util.Queue;

public class Evento {
    Queue<Asistente> cola;
    int aforo;
    int cantDisponibles;

    public Evento(int aforo) {
        this.aforo = aforo;
        this.cantDisponibles = aforo;
        this.cola = new LinkedList<>();
    }

    public void registrarComprador(Asistente asistente) {
        if(cantDisponibles >0){
            this.cola.add(asistente);

        }
        System.out.println("Sold out");
    }

    public void procesarSiguienteCompra() {
        Asistente siguienteAsistente = this.cola.remove();
        if (siguienteAsistente.getTiquetesComprados() <= this.cantDisponibles) {
            this.cantDisponibles -= siguienteAsistente.getTiquetesComprados();
            siguienteAsistente.ingresoAceptado();
        } else {
            System.out.println("Sold out");
        }
    }

    public Queue<Asistente> getCola() {
        return cola;
    }

}
