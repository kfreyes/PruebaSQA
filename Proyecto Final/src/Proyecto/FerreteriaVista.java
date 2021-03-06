package Proyecto;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class FerreteriaVista extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("MenuPrincipal.fxml")); 
			Scene scene=new Scene(root);
			primaryStage.setTitle("Menu Principal");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}



}
