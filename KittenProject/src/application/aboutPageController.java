/**
 * About Page Controller

 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */
package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.effect.Shadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class aboutPageController extends Main implements Initializable {

	/**
	 * about version 
	 */
	@FXML Text aboutVersion;


	/**
	 * Initialize function, called at the start
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	@Override
    public void initialize(URL url, ResourceBundle rb) {
        aboutVersion.setText(getVersion());
    }
	
    /**
     * Halt exits the program
     * @param event
     */
    @FXML
    void halt(MouseEvent event) {
    	((Node)(event.getSource())).getScene().getWindow().hide();
    }
    
    /**
     * hover shadow
     * @param event
     */
    @FXML
    void hoverShadow(MouseEvent event) {
        ((Node) event.getSource()).setEffect(new Shadow(0.8, null));
    }
    
    /**
     * un-shadows
     * @param event
     */
    @FXML
    void unglow(MouseEvent event) {
        ((Node) event.getSource()).setEffect(null);
    }

}