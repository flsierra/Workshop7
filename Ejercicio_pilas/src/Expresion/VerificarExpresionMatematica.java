package Expresion;

import java.util.Stack;

public class VerificarExpresionMatematica {
    public VerificarExpresionMatematica() {
    }

    public static boolean esExpresionValida(String expresion) {
        Stack<Character> pila = new Stack();
        char[] var2 = expresion.toCharArray();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            char caracter = var2[var4];
            if (caracter != '(' && caracter != '[' && caracter != '{') {
                if (caracter == ')' || caracter == ']' || caracter == '}') {
                    if (pila.isEmpty()) {
                        return false;
                    }

                    char apertura = (Character)pila.pop();
                    if (!esParValido(apertura, caracter)) {
                        return false;
                    }
                }
            } else {
                pila.push(caracter);
            }
        }

        return pila.isEmpty();
    }

    private static boolean esParValido(char apertura, char cierre) {
        return apertura == '(' && cierre == ')' || apertura == '[' && cierre == ']' || apertura == '{' && cierre == '}';
    }
}
