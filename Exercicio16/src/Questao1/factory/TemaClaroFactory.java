package Questao1.factory;

import Questao1.model.Label;
import Questao1.model.LabelClara;
import Questao1.model.TextBox;
import Questao1.model.TextBoxClara;

public class TemaClaroFactory implements TemaFactory {
    @Override
    public TextBox createTextBox() {
        return new TextBoxClara();
    }

    @Override
    public Label createLabel() {
        return new LabelClara();
    }
}
