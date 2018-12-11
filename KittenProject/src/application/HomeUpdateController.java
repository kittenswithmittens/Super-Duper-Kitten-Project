package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Shadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;


public class HomeUpdateController extends Main implements Initializable {
	@FXML MenuButton menuButton;
	@FXML TextField electricBill;
	
	
	private double xOffset = 0;
    private double yOffset = 0;
    
//    final ExportableDataAggregate myModel;
    
//    /**
//     * Date: 11/25/18
//     * @author Isaiah Miller
//     */
//    public HomeUpdateController() {
//    	final Config overallConfig = new Config();
//    	final Settings overallSettings = new Settings();
//    	overallConfig.initFromConfig(theHome, overallSettings);
//    	myModel = new ExportableDataAggregate(overallSettings, overallConfig, theHome);
//	}

    
	
	@Override
    public void initialize(URL url, ResourceBundle rb) {
		//init
		//initialize all values to home values
		//grunt work below
		electricBill.setText("" + myMainHome.getMyElectricBill());
    }
	
    @FXML
    void update(MouseEvent event) throws IOException {
    	changeScene("list.fxml", event);
    	//change back to project list and update home values.
    	//grunt work below
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
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("menuBox.fxml"));
        loader.setControllerFactory(new Callback<Class<?>, Object>() {
            @Override
            public Object call(Class<?> aClass) {
                return new menuBoxController();
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
   

