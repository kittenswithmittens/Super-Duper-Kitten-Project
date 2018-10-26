package application;

import javafx.scene.input.MouseEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mainPageController {

	@FXML
    public void moveOn(MouseEvent event) throws IOException {
    	Parent tableViewParent = FXMLLoader.load(getClass().getResource("ProjectListView.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //sets new scene
        window.setScene(tableViewScene);
        window.show();
    }

	@FXML
    public void mouseEntered(MouseEvent event) throws IOException {
		//do stuff
	}
	@FXML
    public void mouseExited(MouseEvent event) throws IOException {
		//do stuff
	}
}