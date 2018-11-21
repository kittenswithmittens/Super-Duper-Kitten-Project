package application;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.effect.Glow;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;



public class menuBoxController extends Main {
	

	
	
    @FXML
    void exportFile(MouseEvent event) {
        System.out.println("costSort");

    }
    @FXML
    void importFile(MouseEvent event) {
        System.out.println("costSort");
        
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Home Profile");
        File file = fileChooser.showOpenDialog(myStage);
        if (file != null) {
        	System.out.println("Opening" + file);
        }
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