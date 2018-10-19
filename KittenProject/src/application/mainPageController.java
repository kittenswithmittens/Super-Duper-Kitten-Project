package application;

import javafx.scene.input.MouseEvent;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mainPageController {


    public void moveOn(MouseEvent event) throws IOException {
    	Parent tableViewParent = FXMLLoader.load(getClass().getResource("kittenproject2.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        //sets new scene
        window.setScene(tableViewScene);
        window.show();
    }


}
