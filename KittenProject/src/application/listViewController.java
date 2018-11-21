package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Shadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class listViewController extends Main {
	@FXML MenuButton menuButton;

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
    void ProjectPage(ActionEvent event) throws IOException {
    	// do nothing, already there
    }

    @FXML
    void export(ActionEvent event) {
    	//exports stuff
    }

    @FXML
    void print(ActionEvent event) {
    	//prints stuff
    }
    
    @FXML
    void halt(MouseEvent event) {
        Platform.exit();
    }
    
    @FXML
    void costSort(MouseEvent event) {
        System.out.println("costSort");
    }
    @FXML
    void difficultySort(MouseEvent event) {
        System.out.println("difficultySort");
    }
    @FXML
    void energySort(MouseEvent event) {
        System.out.println("energySort");
    }
    
    @FXML
    void hoverGlow(MouseEvent event) {
        ((Node) event.getSource()).setEffect(new Glow(0.8));
    }
    
    @FXML
    void hoverShadow(MouseEvent event) {
        ((Node) event.getSource()).setEffect(new Shadow(0.8, null));
    }
    
    @FXML
    void unglow(MouseEvent event) {
        ((Node) event.getSource()).setEffect(null);
    }

    @FXML
    void about(MouseEvent event) throws IOException {
    	Stage stage = new Stage();
    	stage.setTitle("About");
	 	stage.getIcons().add(new Image("application/resources/constructlogo.png"));
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("aboutPage.fxml")); //maybe the issue
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    @FXML
    void menu(MouseEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Menu");
        stage.getIcons().add(new Image("application/resources/constructlogo.png"));
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("menuBox.fxml")); //maybe the issue
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}