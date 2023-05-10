package com.example.exo4;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ex4 extends Application {
    private Pane P;
    private Label Haut;

    private int[] Compteur = {0, 0, 0};

    public void start(Stage primaryStage) throws Exception {
        this.P = new Pane();
        this.Haut = new Label();
        BorderPane BP = new BorderPane();
        HBox MBoutton = new HBox();
        Button Vert = new Button("Vert");
        Button Rouge = new Button("Rouge");
        Button Bleu = new Button("Bleu");
        HBox.setMargin( Rouge, new Insets(10.0d, 10.0d, 10.0d, 10.0d) );
        HBox.setMargin( Vert, new Insets(10.0d, 0.0d, 10.0d, 0.0d) );
        HBox.setMargin( Bleu, new Insets(10.0d, 0.0d, 10.0d, 0.0d) );
        MBoutton.setAlignment( Pos.CENTER );

        Vert.setOnAction( actionEvent -> handleButonClick(actionEvent, "Vert") );
        Rouge.setOnAction( actionEvent -> handleButonClick(actionEvent, "Rouge") );
        Bleu.setOnAction( actionEvent -> handleButonClick(actionEvent, "Bleu") );



        MBoutton.getChildren().addAll(Vert, Rouge, Bleu);
        BP.setTop(Haut);
        BP.setCenter(P);
        BP.setBottom(MBoutton);

        Scene scene = new Scene(BP);
        primaryStage.setScene(scene);
        primaryStage.setTitle("");
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
        primaryStage.show();
    }
    private void handleButonClick(Event event, String Couleur) {
        if (Couleur == "Vert") {
            Compteur[0] += 1;
            Haut.setText("Vert choisi " + Compteur[0] + " fois");
            P.setStyle("-fx-background-color: Green");
        }else if (Couleur == "Rouge") {
            Compteur[1] += 1;
            Haut.setText("Rouge choisi " + Compteur[1] + " fois");
            P.setStyle("-fx-background-color: Red");
        }else {
            Compteur[2] += 1;
            Haut.setText("Bleu choisi " + Compteur[2] + " fois");
            P.setStyle("-fx-background-color: Blue");
        }
    }
}
