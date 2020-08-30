package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;

public class Controller {

    @FXML
    private javafx.scene.control.TextField textField;
    @FXML
    private javafx.scene.control.TextArea textArea;

    public void onClickSend(ActionEvent actionEvent) {
        textArea.appendText (textField.getText () + "\n"); // возьми и передай значения вводимые через кнопку 4
        textField.requestFocus (); // возврат фокуса на вводимую строку
        textField.clear ();
    }
}
