package Tickets;

public class Asistente {
    private int tiquetesComprados;
    private boolean ingreso;

    public Asistente(int tiquetesComprados) {
        this.tiquetesComprados = tiquetesComprados;

        this.ingreso=false;
    }

    public int getTiquetesComprados() {
        return tiquetesComprados;
    }

    public void setTiquetesComprados(int tiquetesComprados) {
        this.tiquetesComprados = tiquetesComprados;
    }

    public void ingresoAceptado(){
        this.ingreso=true;
    }

    @Override
    public String toString() {
        return "Asistente{" +
                "tiquetesComprados=" + tiquetesComprados +
                '}';
    }
}
