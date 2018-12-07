package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


/// this is no longer used!



public class UpdateViewController extends Main {
	@FXML MenuButton menuButton;

	//BUTTON CONTROLS START

    @FXML
    void BackButton(MouseEvent event) throws IOException {
    	changeScene("ProjectListView.fxml", event);
    }

    @FXML
    void DoneButton(MouseEvent event) throws IOException {
    	changeScene("ProjectListView.fxml", event);
    }

    @FXML
    void EnergyCosts(MouseEvent event) throws IOException {
    	changeScene("LightBulbUpdateView.fxml", event);
    }

    @FXML
    void HeatingCooling(MouseEvent event) throws IOException {
    	changeScene("LightBulbUpdateView.fxml", event);
    }

    @FXML
    void LightBulbs(MouseEvent event) throws IOException {
    	changeScene("LightBulbUpdateView.fxml", event);
    }

    @FXML
    void OtherUpdate(MouseEvent event) throws IOException {
    	changeScene("LightBulbUpdateView.fxml", event);
    }

    @FXML
    void WaterHeater(MouseEvent event) throws IOException {
    	changeScene("LightBulbUpdateView.fxml", event);
    }

    @FXML
    void Windows(MouseEvent event) throws IOException {
    	changeScene("LightBulbUpdateView.fxml", event);
    }





	// BUTTON CONTROLS END

	// MENU BUTTON START
    @FXML
    void UpdatePage(ActionEvent event) throws IOException {
    	//do nothing, already there
    }

    @FXML
    void ProjectPage(ActionEvent event) throws IOException {
    	Parent UpdateMainParent = FXMLLoader.load(getClass().getResource("ProjectListView.fxml"));
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
    	System.out.println("export controller method called");
    }

    @FXML
    void print(ActionEvent event) {
    	//prints stuff
    }

    @FXML
    void about(ActionEvent event) throws IOException {
    	Stage stage = new Stage();
    	stage.setTitle("About");
	 	stage.getIcons().add(new Image("application/resources/constructlogo.png"));
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("aboutPage.fxml")); //maybe the issue
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    // MENU BUTTON END
}