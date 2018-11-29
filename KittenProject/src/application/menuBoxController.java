package application;

import java.io.File;
import java.io.IOException;

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
public class menuBoxController {
	final Settings mySettings;

	public menuBoxController(final Settings theSettings) {
		mySettings = theSettings;
	}

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
        //direct access to the menuBox Controller
//        Parent root = (Parent) FXMLLoader.load(getClass().getResource("menuBoxController.fxml")); //maybe the issue
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

	@FXML
	void hoverGlow(MouseEvent event) {
		((Node) event.getSource()).setEffect(new Glow(0.8));
	}

	@FXML
	void unglow(MouseEvent event) {
		((Node) event.getSource()).setEffect(null);
	}
}