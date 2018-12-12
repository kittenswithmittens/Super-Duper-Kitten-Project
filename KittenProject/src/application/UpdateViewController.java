/**
 * Update View Controller
 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */
package application;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import java.io.IOException;

import javafx.fxml.FXML;


/// Happy Easter Egg

public class UpdateViewController extends Main {
	/**
	 * backButton
	 */
	@FXML
    private ImageView backButton;

    /**
     * goes back to previous page
     * @param event
     * @throws IOException
     */
    @FXML
    void BackButton(MouseEvent event) throws IOException {
    	//Sound.sounds[1].mediaPlayer.stop();
    	changeScene("projectView.fxml", event);
    }

}