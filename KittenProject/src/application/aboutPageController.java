package application;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

public class aboutPageController extends Main implements Initializable {

	@FXML Text aboutVersion;


	@Override
    public void initialize(URL url, ResourceBundle rb) {
        aboutVersion.setText(getVersion());
    }

}