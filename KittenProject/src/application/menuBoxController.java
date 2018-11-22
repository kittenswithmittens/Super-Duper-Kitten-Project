package application;

import java.io.File;

import javafx.fxml.FXML;import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.effect.Glow;
import javafx.scene.input.MouseEvent;
//<<<<<<< Updated upstream
//import javafx.stage.FileChooser;



//public class menuBoxController extends Main {
//	
//
//	
//	
//    @FXML
//    void exportFile(MouseEvent event) {
//        System.out.println("costSort");
//
//    }
//    @FXML
//    void importFile(MouseEvent event) {
//        System.out.println("costSort");
//        
//=======
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
		

//>>>>>>> Stashed changes
//        FileChooser fileChooser = new FileChooser();
//        fileChooser.setTitle("Open Home Profile");
//        File file = fileChooser.showOpenDialog(myStage);
//        if (file != null) {
//        	System.out.println("Opening" + file);
//        }
	

	@FXML
	void hoverGlow(MouseEvent event) {
		((Node) event.getSource()).setEffect(new Glow(0.8));
	}

	@FXML
	void unglow(MouseEvent event) {
		((Node) event.getSource()).setEffect(null);
	}
}