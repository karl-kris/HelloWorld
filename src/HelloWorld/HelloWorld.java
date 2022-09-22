/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package HelloWorld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
// import javafx.scene.layout.GridPane;
// import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
// import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author usu2dam
 */
public class HelloWorld extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        Button btn1 = new Button();
        btn1.setText("Boton 2");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Botón 2 en acción");
            }
        });
        
        StackPane root = new StackPane();
        // HBox root = new HBox();
        // VBox root = new VBox();
        // GridPane root = new GridPane();
        root.getChildren().add(btn);
        // root.getChildren().addAll(btn, btn1);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
