package com.Shivam;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FirstJavaFXFile extends Application{

	@FXML
	private ComboBox Qualification;
	
	
	public static void main(String[] args) {  
        launch(args);  
    }

	
	@Override
	@FXML
    public void start(Stage primaryStage) throws Exception {
		try {
		Parent root = FXMLLoader.load(getClass().getResource("/com/Shivam/Pharmacy.fxml"));
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
    }
	
}
