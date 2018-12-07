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

	@FXML Text aboutVersion;


	@Override
    public void initialize(URL url, ResourceBundle rb) {
        aboutVersion.setText(getVersion());
    }
	
    @FXML
    void halt(MouseEvent event) {
    	((Node)(event.getSource())).getScene().getWindow().hide();
    }
    
    @FXML
    void hoverShadow(MouseEvent event) {
        ((Node) event.getSource()).setEffect(new Shadow(0.8, null));
    }
    
    @FXML
    void unglow(MouseEvent event) {
        ((Node) event.getSource()).setEffect(null);
    }

}