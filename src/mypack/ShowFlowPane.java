/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

/**
 *
 * @author Brandon Koenning
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class ShowFlowPane extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);
        
        pane.getChildren().addAll(new Label("First Name:"), new TextField(), new Label("MI:"));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());
        
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowFlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
