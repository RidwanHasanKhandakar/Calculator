package com.example.class_19th;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ArithmeticOPController {

    public TextArea answerTextArea;
    @javafx.fxml.FXML
    private TextField firstNumTextField;
    @javafx.fxml.FXML
    private TextField secondNumTextField;
    @javafx.fxml.FXML
    private Label errorLabel;

    public void initialize(){

}
    @javafx.fxml.FXML
    public void handlePlusButton(ActionEvent actionEvent) {
    int firstNum = Integer.parseInt(firstNumTextField.getText());
    int secondNum = Integer.parseInt(secondNumTextField.getText());
    int answer = firstNum+secondNum;
    answerTextArea.setText("firstNum + secondNum = " + answer);
    //resTextArea.setText("Answer: "+answer);
    }

    @javafx.fxml.FXML
    public void handleMinusButton(ActionEvent actionEvent) {
        int firstNum = Integer.parseInt(firstNumTextField.getText());
        int secondNum = Integer.parseInt(secondNumTextField.getText());
        int answer = firstNum-secondNum;
        answerTextArea.setText("firstNum - secondNum = " + answer);

    }

    @javafx.fxml.FXML
    public void handleMultipleButton(ActionEvent actionEvent) {
        int firstNum = Integer.parseInt(firstNumTextField.getText());
        int secondNum = Integer.parseInt(secondNumTextField.getText());
        int answer = firstNum*secondNum;
        answerTextArea.setText("firstNum * secondNum = " + answer);

    }

    @javafx.fxml.FXML
    public void handleDivideButton(ActionEvent actionEvent) {
        int firstNum = Integer.parseInt(firstNumTextField.getText());
        int secondNum = Integer.parseInt(secondNumTextField.getText());
        int answer = firstNum/secondNum;
        answerTextArea.setText("firstNum / secondNum = " + answer);

    }
}
