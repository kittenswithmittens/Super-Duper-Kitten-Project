package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	 @Override
	    public void start(Stage stage) throws Exception {
	        Parent root = (Parent) FXMLLoader.load(getClass().getResource("kittenproject.fxml")); //maybe the issue

	        Scene scene = new Scene(root);

	        stage.setScene(scene);
	        stage.show();
	    }

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        launch(args);
	    }
}
