package javafx19;

import javafx.scene.layout.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nikhil_Rana
 */
public class FirstLayoutDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b1 = new Button("button");
        FlowPane fp = new FlowPane();
        fp.getChildren().add(b1);
        Scene sc = new Scene(fp, 200, 200);
        stage.setTitle("Layout");
        stage.setScene(sc);
        stage.show();

    }

}
