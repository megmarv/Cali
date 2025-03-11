package com.example.cali;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CaliController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}