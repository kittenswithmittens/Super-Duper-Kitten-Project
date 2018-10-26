package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;


public class Main extends Application {
	 @Override
	    public void start(Stage stage) throws Exception {
		 	stage.setTitle("Kitten-Construction");
		 	stage.getIcons().add(new Image("application/resources/constructlogo.png"));
	        Parent root = (Parent) FXMLLoader.load(getClass().getResource("kittenproject.fxml")); //maybe the issue
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.setResizable(false);
	        stage.show();
	    }

	 	public void changeScene(String A, MouseEvent event) throws IOException {
	 		Parent tableViewParent = FXMLLoader.load(getClass().getResource(A));
	        Scene tableViewScene = new Scene(tableViewParent);
	        //This line gets the Stage information
	        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	        //sets new scene
	        window.setScene(tableViewScene);
	        window.show();

	 	}

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        launch(args);
	    }
}
