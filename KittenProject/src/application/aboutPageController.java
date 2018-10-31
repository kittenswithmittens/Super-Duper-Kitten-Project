package application;

import javafx.scene.input.ContextMenuEvent;
import javafx.scene.text.Text;
import javafx.fxml.FXML;

public class aboutPageController extends Main {

	@FXML Text aboutVersion;

	@FXML
    void update(ContextMenuEvent event) {
		aboutVersion.setText(getVersion());
    }

}