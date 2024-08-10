package com.liam.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label newLabelText;

    private boolean isHide;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        isHide = !isHide;
        if (isHide) {
            setNotHide();
        } else {
            setHide();
        }
    }

    protected void setHide() {
        newLabelText.setDisable(true);
        newLabelText.setText(null);
    }

    protected void setNotHide() {
        newLabelText.setDisable(false);
        newLabelText.setText("this is new Label text");
    }
}