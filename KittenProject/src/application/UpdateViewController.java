package application;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.io.IOException;

import javafx.fxml.FXML;


/// Happy Easter Egg



public class UpdateViewController extends Main {
	@FXML
    private ImageView backButton;



    @FXML
    void BackButton(MouseEvent event) throws IOException {
    	changeScene("projectView.fxml", event);
    }

}