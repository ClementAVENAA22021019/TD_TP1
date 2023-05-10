package com.example.partie2;

import javafx.event.Event;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ButtonClickHandler {
    private Label helloLabel;
    private TextField nameField;

    public ButtonClickHandler(Label helloLabel, TextField nameField) {
        this.helloLabel = helloLabel;
        this.nameField = nameField;
    }

    //@Override
    public void handle(Event event) {
        // Utiliser le Label récupéré
        helloLabel.setText( "Bonjour à toi, "+nameField.getText() );
    }
}
