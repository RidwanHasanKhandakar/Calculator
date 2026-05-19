package com.example.class_19th;

import javafx.event.ActionEvent;

import java.awt.*;

public class ArithmeticOPController {

    @javafx.fxml.FXML
    private TextArea resTextArea;
    @javafx.fxml.FXML
    private TextField firstNumTextField;
    @javafx.fxml.FXML
    private TextField secondNumTextField;

    public void initialize(){

}
    @javafx.fxml.FXML
    public void handlePlusButton(ActionEvent actionEvent) {
    int firstNum = Integer.parseInt(firstNumTextField.getText());
    int secondNum = Integer.parseInt(secondNumTextField.getText());
    int answer = firstNum+secondNum;
    resTextArea.setText("Answer: "+answer);
    }

    @javafx.fxml.FXML
    public void handleMinusButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void handleMultipleButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void handleDivideButton(ActionEvent actionEvent) {

    }
}
