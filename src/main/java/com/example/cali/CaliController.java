package com.example.cali;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CaliController {

    @FXML private TextField display;

    @FXML private Text userInput;

    private String firstNumber = "";

    private String currentNumber = "";

    private String calculationType;

    @FXML
    void add(ActionEvent event) {
        calculationSetup("+");
    }

    @FXML
    void substract(ActionEvent event) {
        calculationSetup("-");
    }

    @FXML
    void divide(ActionEvent event) {
        calculationSetup("/");
    }

    @FXML
    void multiply(ActionEvent event) {
        calculationSetup("*");
    }

    public void calculationSetup(String calculationType){
        this.calculationType = calculationType;
        firstNumber = currentNumber;
        currentNumber = "";
        userInput.setText(firstNumber + " " + calculationType);
    }

    @FXML
    void calculate(ActionEvent event) {
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(currentNumber);

        switch (calculationType) {
            case "+" -> {
                int calculatedNumber = firstNumberInt + secondNumberInt;
                userInput.setText(firstNumber + " + " + currentNumber + " = " + calculatedNumber);
                display.setText(String.valueOf(calculatedNumber));
            }
            case "-" -> {
                int calculatedNumber = firstNumberInt - secondNumberInt;
                userInput.setText(firstNumber + " - " + currentNumber + " = " + calculatedNumber);
                display.setText(String.valueOf(calculatedNumber));
            }
            case "/" -> {
                double calculatedNumber = firstNumberInt / (double)secondNumberInt;
                userInput.setText(firstNumber + " / " + currentNumber + " = " + calculatedNumber);
                display.setText(String.valueOf(calculatedNumber));
            }
            case "*" -> {
                int calculatedNumber = firstNumberInt * secondNumberInt;
                userInput.setText(firstNumber + " * " + currentNumber + " = " + calculatedNumber);
                display.setText(String.valueOf(calculatedNumber));
            }
        }
    }

    @FXML
    void clearTextField(ActionEvent event) {
        currentNumber = "";
        display.setText("");
        userInput.setText("");
    }

    @FXML
    void button0Clicked(ActionEvent event) {
        if(!currentNumber.equals("")){
            addNumber("0");
        }
    }

    @FXML
    void button1Clicked(ActionEvent event) {
        addNumber("1");
    }

    @FXML
    void button2Clicked(ActionEvent event) {
        addNumber("2");
    }

    @FXML
    void button3Clicked(ActionEvent event) {
        addNumber("3");
    }

    @FXML
    void button4Clicked(ActionEvent event) {
        addNumber("4");
    }

    @FXML
    void button5Clicked(ActionEvent event) {
        addNumber("5");
    }

    @FXML
    void button6Clicked(ActionEvent event) {
        addNumber("6");
    }

    @FXML
    void button7Clicked(ActionEvent event) {
        addNumber("7");
    }

    @FXML
    void button8Clicked(ActionEvent event) {
        addNumber("8");
    }

    @FXML
    void button9Clicked(ActionEvent event) {
        addNumber("9");
    }

    public void updateTextField(){
        display.setText(currentNumber);
    }

    public void addNumber(String number){
        currentNumber += number;
        updateTextField();
    }

}

