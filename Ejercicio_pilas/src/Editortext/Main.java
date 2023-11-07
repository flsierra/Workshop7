package Editortext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Bienvenidos a su editor de Texto más pelero \n");
            System.out.print("Use el comando -1 para deshacer la ultima palabra, +print para imprimir el texto y +1 para rehacer lo borrado\n");
            System.out.print("Ingrese el texto a agregar: \n");
            String newText = scanner.nextLine();
            newText = newText + " ";
            if (newText.equals("-1 ")) {
                editor.undo();
            }
            else if (newText.equals("+print ")) {
                System.out.println("Texto actual: " + editor.getText());
            } else if (newText.equals("+1 ")) {
                editor.redo();
            }
            else {
                editor.appendText(newText);
            }
        }
    }
}
