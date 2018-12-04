package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Shadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;


public class projectViewController extends Main implements Initializable {
	@FXML MenuButton menuButton;
	@FXML Text projectName;
    @FXML Text projectCost;
    @FXML Text projectDifficulty;
    @FXML Text projectSavings;
    @FXML Text projectDescription;

	private double xOffset = 0;
    private double yOffset = 0;
    
    project selected;

	
	@Override
    public void initialize(URL url, ResourceBundle rb) {
		selected = listViewController.getSelected();
		projectName.setText(selected.toString());
		projectCost.setText("Cost: $" + selected.getCost());
		projectDifficulty.setText("Difficulty: " + selected.getDifficulty());
		projectSavings.setText("Energy Savings: $" + selected.getSavings());
		projectDescription.setText(selected.getDescription());
    }
	
	@FXML
    void back(MouseEvent arg0) throws IOException {
	    changeScene("list.fxml", arg0);
    }
	
    @FXML
    void halt(MouseEvent event) {
        Platform.exit();
    }

    
    @FXML
    void hoverGlow(MouseEvent event) {
        ((Node) event.getSource()).setEffect(new Glow(0.8));
    }
    
    @FXML
    void hoverShadow(MouseEvent event) {
        ((Node) event.getSource()).setEffect(new Shadow(0.8, null));
    }
    
    @FXML
    void unglow(MouseEvent event) {
        ((Node) event.getSource()).setEffect(null);
    }

    @FXML
    void about(MouseEvent event) throws IOException {
    	Stage stage = new Stage();
    	stage.initStyle(StageStyle.UNDECORATED);
    	stage.setTitle("About");
	 	stage.getIcons().add(new Image("application/resources/constructlogo.png"));
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("aboutPage.fxml")); //maybe the issue
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        
        //movability section
	      //grab your root here
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        }
    });

    //move around here
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
        }
    });
    }
    
    
    
    @FXML
    void menu(MouseEvent event) throws IOException {
    	double x = ((Node)(event.getSource())).getScene().getWindow().getX();
        double y = ((Node)(event.getSource())).getScene().getWindow().getY();
    	final Settings model = new Settings();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("menuBox.fxml"));
        loader.setControllerFactory(new Callback<Class<?>, Object>() {
            @Override
            public Object call(Class<?> aClass) {
                return new menuBoxController(model);
            }
        });
    	
    	
    	
        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("Menu");
        stage.getIcons().add(new Image("application/resources/constructlogo.png"));
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        //position menu
        stage.setX(x + 35);
        stage.setY(y + 35);      
        //end position menu
        
        stage.show();
        

        
        
        //movability section
	      //grab your root here
        root.setOnMousePressed(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        }
    });

    //move around here
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent event) {
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
        }
    });
    }

    
    
    

    
    
    
}
   

