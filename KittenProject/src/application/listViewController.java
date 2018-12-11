package application;

import java.io.File;
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
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Shadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;

public class listViewController extends Main implements Initializable {
	@FXML MenuButton menuButton;
	@FXML Pane pane;
	@FXML ListView<project> listView;
	private double xOffset = 0;
    private double yOffset = 0;
//    Settings mySettings;
    
    static project selected;
    ProjectList myProjects;
    
//    final ExportableDataAggregate myPersistentData;
    
//    public listViewController() {
//    	final Config overallConfig = new Config();
//    	final Settings overallSettings = new Settings();
//    	overallConfig.initFromConfig(myMainHome, overallSettings);
//    	myPersistentData = new ExportableDataAggregate(overallSettings, overallConfig, myMainHome);
//    }
    
	@Override
    public void initialize(URL url, ResourceBundle rb) {
				//populates list
		listView.setEditable(true);
		myProjects = new ProjectList();
		listView.setItems(myProjects.getPros());
		pane.setVisible(false);
//		mySettings = new Settings();
		//end populate
    }
	
	public static project getSelected() {
	    return selected;
	}
	
	//clicking list item
	@FXML public void handleMouseClick(MouseEvent arg0) throws IOException {
	    selected = listView.getSelectionModel().getSelectedItem();                      //remembers what was clicked, needs to be pass on to projectview
	    //System.out.println("clicked on " + selected); //prints what you clicked on
	    if(selected != null) {
	        changeScene("projectView.fxml", arg0);
	    }
	}
	
	
    @FXML
    void halt(MouseEvent event) {
        Platform.exit();
    }
    
    @FXML
    void costSort(MouseEvent event) {
    	myProjects.sortCost();
       
    }
    
    @FXML
    void difficultySort(MouseEvent event) {
    	myProjects.sortDifficulty();
    	
    }
    
    @FXML
    void energySort(MouseEvent event) {
    	myProjects.sortEnergySavings();
       
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
        pane.setVisible(true);
    }
    
    @FXML
    void hideMenu(MouseEvent event) throws IOException {
        pane.setVisible(false);
    }
    
    @FXML
    void exportFile(final MouseEvent event) {
        // call File chooser's export method pass the stage
        final Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        final File exportDest = FileChooserDIY.specSaveFile(stage);
        if (exportDest != null) {
            myPersistentData.exportJSON(exportDest);
        }
    }

    @FXML
    void importFile(MouseEvent event) {
        final Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        final File importDest = FileChooserDIY.specOpenFile(stage);
        if (importDest != null) {
            myPersistentData.importJSON(importDest);
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
                return new SettingsController(myPersistentData.getMySettings());
            }
        });
        
        
        
        Stage stage = new Stage();
        stage.setTitle("Settings");
        stage.getIcons().add(new Image("application/resources/constructlogo.png"));

        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    @FXML
    void openUpdaterView(MouseEvent arg0) throws IOException {
        //((Node)(arg0.getSource())).getScene().getWindow().hide();
        changeScene("edithome.fxml", arg0);
    }
}
   

