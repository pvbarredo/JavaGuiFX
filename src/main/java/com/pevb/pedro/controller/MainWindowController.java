package com.pevb.pedro.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * Created by BARREPE on 8/3/2018.
 */
public class MainWindowController {
    @FXML
    Button tapButton;

    @FXML
    Label tapLabel;


    public void tapButtonClicked(){
        tapLabel.setText(tapLabel.getText() + " Tap! ");
    }
}
