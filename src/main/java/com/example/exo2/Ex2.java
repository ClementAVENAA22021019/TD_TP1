package com.example.exo2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Random;

public class Ex2 extends Application {
    public void start(Stage primaryStage) throws Exception {
        //Grid et Cases
        GridPane GP = new GridPane();
        GP.setGridLinesVisible(true);
        Label i00 = new Label();
        Label i01 = new Label();
        Label i02 = new Label();
        Label i10 = new Label();
        Label i20 = new Label();
        Label i11 = new Label();
        Label i21 = new Label();
        Label i12 = new Label();
        Label i22 = new Label();

        //Chargement images
        Image CCroix = new Image(Ex2.class.getResource("Croix.png").toString());
        Image CRond = new Image(Ex2.class.getResource("Rond.png").toString());
        Image CVide = new Image(Ex2.class.getResource("Vide.png").toString());
        ImageView Croix = new ImageView(CCroix);
        ImageView Rond = new ImageView(CRond);
        ImageView Vide = new ImageView(CVide);
        ImageView Tab[] = {Croix, Rond, Vide};

        //Disposition des cases
        GP.add(i00, 0, 0);
        GP.add(i01, 0, 1);
        GP.add(i02, 0, 2);
        GP.add(i10, 1, 0);
        GP.add(i11, 1, 1);
        GP.add(i12, 1, 2);
        GP.add(i20, 2, 0);
        GP.add(i21, 2, 1);
        GP.add(i22, 2, 2);

        //Application des images sur les cases
        Random random = new Random();
        i00.setGraphic(Tab[random.nextInt(3)]);
        i01.setGraphic(Tab[random.nextInt(3)]);
        i02.setGraphic(Tab[random.nextInt(3)]);
        i10.setGraphic(Tab[random.nextInt(3)]);
        i20.setGraphic(Tab[random.nextInt(3)]);
        i11.setGraphic(Tab[random.nextInt(3)]);
        i21.setGraphic(Tab[random.nextInt(3)]);
        i12.setGraphic(Tab[random.nextInt(3)]);
        i22.setGraphic(Tab[random.nextInt(3)]);

        //Creation scene
        Scene scene = new Scene(GP);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TicTacToe");
        primaryStage.setWidth(133);
        primaryStage.setHeight(171);
        primaryStage.show();
    }
}
