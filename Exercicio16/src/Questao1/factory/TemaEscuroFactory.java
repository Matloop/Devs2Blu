package Questao1.factory;

import Questao1.model.*;

public class TemaEscuroFactory implements TemaFactory {

    @Override
    public TextBox createTextBox() {
        return new TextBoxEscura();
    }

    @Override
    public Label createLabel() {
        return new LabelEscura();
    }
}
