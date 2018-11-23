package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/*
 * should contain an instance of Settings
 * Should contain an instance of FileChooserDIY which it will pass 
 * the settings instance to
 */
public class SettingsController {
	final Settings mySettings;
	@FXML
	TextField myNameField;
	@FXML
	TextField myEmailField;
	
	public SettingsController(final Settings theSettings) {
		mySettings = theSettings;
	}
	
	@FXML
	private void saveSettings(final MouseEvent event) {
		//save settings from the text fields to model object
//		GridPane x = (GridPane) (((Node) event.getSource()).getParent());
		mySettings.setMyName(myNameField.getText());
		mySettings.setMyEmailAddress(myEmailField.getText());
		System.out.println("myNameField is: " + myNameField.getText());
		System.out.println("myEmailField is: " + myEmailField.getText());
	}
	
}
