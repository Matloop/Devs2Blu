package br.com.exemplo.memento.questao1;

import br.com.exemplo.memento.questao1.component.TextEditor;
import br.com.exemplo.memento.questao1.memory.CareTaker;

public class MementoMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker caretaker = new CareTaker();
        System.out.println("Texto atual: " + editor.getText());
        editor.setText("Vers�o 1");
        caretaker.addMemento(editor.saveToMemento());
        System.out.println("Texto atual: " + editor.getText());
        editor.setText("Vers�o 2");
        caretaker.addMemento(editor.saveToMemento());
        System.out.println("Texto atual: " + editor.getText());
        editor.setText("Vers�o 3");
        caretaker.addMemento(editor.saveToMemento());
        
        System.out.println("Texto atual: " + editor.getText());  // Exibe "Vers�o 3"
        editor.setText("Vers�o 4");
        caretaker.addMemento(editor.saveToMemento());

        System.out.println("Texto atual: " + editor.getText());  // Exibe "Vers�o 3"
        editor.setText("Vers�o 5");
        caretaker.addMemento(editor.saveToMemento());

        System.out.println("Texto atual: " + editor.getText());  // Exibe "Vers�o 3"
        editor.setText("Vers�o 5");
        caretaker.addMemento(editor.saveToMemento());

        System.out.println("Texto atual: " + editor.getText());  // Exibe "Vers�o 3"

        // Desfazendo duas vezes
        editor.restoreFromMemento(caretaker.getLastMemento());
        System.out.println("Ap�s desfazer uma vez: " + editor.getText());  // Exibe "Vers�o 2"

       editor.restoreFromMemento(caretaker.getLastMemento());
       System.out.println("Ap�s desfazer duas vezes: " + editor.getText());  // Exibe "Vers�o 1"
    }
}
