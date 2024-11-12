package br.com.exemplo.memento.questao1.memory;

import java.util.ArrayList;
import java.util.List;

import br.com.exemplo.memento.questao1.component.TextEditor;

public class CareTaker {
    private List<TextEditor.Memento> savedStates = new ArrayList<>();

    // Adiciona um novo memento � lista
    public void addMemento(TextEditor.Memento memento) {
        if(savedStates.size() == 5) {
            savedStates.remove(0);
            System.out.println("Limite excedido, removendo primeiro");
            savedStates.add(memento);
        } else {
            savedStates.add(memento);
        }

    }

    // Recupera o �ltimo memento salvo e remove-o da lista
    public TextEditor.Memento getLastMemento() {
        if (savedStates.size() > 0) {
            return savedStates.remove(savedStates.size() - 1);
        }
        return null;
    }
}