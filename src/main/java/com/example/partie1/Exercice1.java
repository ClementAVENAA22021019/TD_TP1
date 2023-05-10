package com.example.partie1;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Exercice1 extends Application{
    @Override
    public void start(Stage primaryStage) {
        //Menu
        MenuItem FileItem1 = new MenuItem("New");
        MenuItem FileItem2 = new MenuItem("Open");
        MenuItem FileItem3 = new MenuItem("Save");
        MenuItem FileItem4 = new MenuItem("Close");
        Menu File = new Menu("File");
        File.getItems().addAll(FileItem1, FileItem2, FileItem3, FileItem4);

        MenuItem EditItem1 = new MenuItem("Cut");
        MenuItem EditItem2 = new MenuItem("Copy");
        MenuItem EditItem3 = new MenuItem("Paste");
        Menu Edit = new Menu("Edit");
        Edit.getItems().addAll(EditItem1, EditItem2, EditItem3);

        Menu Help = new Menu("Help");
        MenuBar menuBar = new MenuBar(File, Edit, Help);
        //Fin Menu

        Label Txt = new Label();
        Txt.setText("Boutons :");
        Button B1 = new Button("Bouton 1");
        Button B2 = new Button("Bouton 2");
        Button B3 = new Button("Bouton 3");
        Separator sep = new Separator(Orientation.VERTICAL);

        VBox Gauche = new VBox();
        Gauche.getChildren().addAll(Txt, B1, B2, B3);
        Gauche.setAlignment( Pos.CENTER );
        Gauche.setMargin( Txt, new Insets(0.0d, 0.0d, 10.0d, 0.0d) );
        Gauche.setMargin( B1, new Insets(0.0d, 0.0d, 10.0d, 0.0d) );
        Gauche.setMargin( B2, new Insets(0.0d, 0.0d, 10.0d, 0.0d) );

        VBox Droite = new VBox();
        GridPane gridpane = new GridPane();
        Button button = new Button();
        GridPane.setRowIndex(button, 0);
        GridPane.setColumnIndex(button, 1);
        gridpane.add(new Label("Name:"), 0, 1);
        gridpane.add(new Label("Email:"), 0, 2);
        gridpane.add(new Label("Password:"), 0, 3);
        gridpane.add(new TextField(), 1, 1);
        gridpane.add(new TextField(), 1, 2);
        gridpane.add(new TextField(), 1, 3);
        Droite.getChildren().addAll(gridpane);
        gridpane.setAlignment( Pos.CENTER );
        Droite.setAlignment( Pos.CENTER );



        HBox BDP = new HBox();
        Label BasDePage = new Label();
        BasDePage.setText("Ceci est un label de bas de page");
        BDP.setAlignment( Pos.CENTER );
        BDP.getChildren().add(BasDePage);

        VBox Fenetre = new VBox();

        HBox ConteneurMilieu = new HBox();
        Gauche.setVgrow(ConteneurMilieu, Priority.ALWAYS);
        Droite.setVgrow(ConteneurMilieu, Priority.ALWAYS);
        ConteneurMilieu.getChildren().addAll(Gauche, sep, Droite);
        Separator sep2 = new Separator(Orientation.HORIZONTAL);
        Fenetre.getChildren().addAll(menuBar, ConteneurMilieu, sep2, BDP);

        Scene scene = new Scene(Fenetre, 650, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Exemple d'utilisation des arguments en ligne de commande");
        primaryStage.show();
    }
}