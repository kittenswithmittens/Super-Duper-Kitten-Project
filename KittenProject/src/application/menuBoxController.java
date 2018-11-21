package application;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.effect.Glow;
import javafx.scene.input.MouseEvent;

public class menuBoxController extends Main {
    @FXML
    void exportFile(MouseEvent event) {
        System.out.println("costSort");
    }
    @FXML
    void importFile(MouseEvent event) {
        System.out.println("costSort");
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