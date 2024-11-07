package Questao1.factory;

import Questao1.model.Label;
import Questao1.model.TextBox;

public interface TemaFactory {
    TextBox createTextBox();
    Label createLabel();
}
