package Editortext;

import java.util.Stack;
import java.util.Scanner;

public class TextEditor {
    private StringBuilder text;
    private final Stack<String> undoStack;
    private final Stack<String> redoStack;

    public TextEditor() {
        text = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void appendText(String newText) {
        undoStack.push(text.toString());
        text.append(newText);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(text.toString());
            text = new StringBuilder(undoStack.pop());
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(text.toString());
            text = new StringBuilder(redoStack.pop());
        }
    }

    public String getText() {
        return text.toString();
    }
}