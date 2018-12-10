/**
 * Menu Box Controller
 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */
package application;

import java.io.File;
import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Callback;

//observe this with an export controller
public class menuBoxController extends Main{

	/**
	 * mySettings
	 */
	final Settings mySettings;

	/**
	 * sets the settings
	 * @param theSettings
	 */
	public menuBoxController(final Settings theSettings) {
		mySettings = theSettings;
	}

	/**
	 * exports file
	 * @param event
	 */
	@FXML
	void exportFile(final MouseEvent event) {
		// call File chooser's export method pass the stage
		System.out.println("exportButton");
		final Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		final File exportDest = FileChooserDIY.specSaveFile(stage);
		if (exportDest != null) {
			mySettings.exportJSON(exportDest);
		} else {
			System.out.println("File chosen is null. No export performed.");
		}
	}

	/**
	 * import file
	 * @param event
	 */
	@FXML
	void importFile(MouseEvent event) {
		System.out.println("importButton");
		final Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		final File importDest = FileChooserDIY.specOpenFile(stage);
		if (importDest != null) {
			mySettings.importJSON(importDest);
		} else {
			System.out.println("File chosen is null. No export performed.");
		}
	}
	
	/**
	 * @author Isaiah Miller
	 * Opens the Settings view for modifying settings.
	 * @throws IOException 
	 */
	@FXML
	void openSettingsView(MouseEvent event) throws IOException {
		//open settings view, pass settings object
		
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Settings.fxml"));
        loader.setControllerFactory(new Callback<Class<?>, Object>() {
            @Override
            public Object call(Class<?> aClass) {
                return new SettingsController(mySettings);
            }
        });
    	
    	
    	
        Stage stage = new Stage();
        stage.setTitle("Settings");
        stage.getIcons().add(new Image("application/resources/constructlogo.png"));

        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
	
	/**
	 * changes to the edit home screen
	 * @param arg0
	 * @throws IOException
	 */
	@FXML
    void openUpdaterView(MouseEvent arg0) throws IOException {
	    super.changeScene("edithome.fxml", arg0);

//     void openUpdaterView(MouseEvent event) throws IOException {
// 		changeScene("homeUpdaterPage.fxml", event);

	}

	/**
	 * glow
	 * @param event
	 */
	@FXML
	void hoverGlow(MouseEvent event) {
		((Node) event.getSource()).setEffect(new Glow(0.8));
	}

	/**
	 * unglow
	 * @param event
	 */
	@FXML
	void unglow(MouseEvent event) {
		((Node) event.getSource()).setEffect(null);
	}
	
	 /**
	  * closes program
	 * @param event
	 */
	@FXML
	    void halt(MouseEvent event) {
		 ((Node)(event.getSource())).getScene().getWindow().hide();
	    }
}