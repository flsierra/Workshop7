package Expresion;

public class Main {
    public static void main(String[] args) {
        VerificarExpresionMatematica myclase = new VerificarExpresionMatematica();
        String expresion1 = "(3 + 2) * [5 - (2 + 1)]";
        String expresion2 = "5 * (2 + 1";
        if (VerificarExpresionMatematica.esExpresionValida(expresion1)) {
            System.out.println("La expresión 1 es válida.");
        } else {
            System.out.println("La expresión 1 no es válida.");
        }

        if (VerificarExpresionMatematica.esExpresionValida(expresion2)) {
            System.out.println("La expresión 2 es válida.");
        } else {
            System.out.println("La expresión 2 no es válida.");
        }
    }
}
