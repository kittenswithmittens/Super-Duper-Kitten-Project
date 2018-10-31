package application;

import javafx.scene.input.MouseEvent;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

public class mainPageController extends Main {

	@FXML MenuButton menuButton;

	@FXML
    public void moveOn(MouseEvent event) throws IOException {
		changeScene("ProjectListView.fxml", event);
    }

	@FXML
    public void mouseEntered(MouseEvent event) throws IOException {
		//do stuff
	}
	@FXML
    public void mouseExited(MouseEvent event) throws IOException {
		//do stuff
	}

	// MENU BUTTON START

	@FXML
    void UpdatePage(ActionEvent event) throws IOException {
    	Parent UpdateMainParent = FXMLLoader.load(getClass().getResource("UpdateMainPageView.fxml"));
        Scene tableViewScene = new Scene(UpdateMainParent);
        //This line gets the Stage information
        Stage window = (Stage) menuButton.getScene().getWindow();
        //sets new scene
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    void export(ActionEvent event) {
    	//exports stuff
    }

    @FXML
    void print(ActionEvent event) {
    	//prints stuff
    }

    // MENU BUTTON END
}