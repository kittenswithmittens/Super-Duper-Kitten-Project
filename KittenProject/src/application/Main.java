package application;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;

public class Main extends Application {

	/* Stage field. */
	public Stage myStage;
	
		public double version = 1.00;
	    private double xOffset = 0;
	    private double yOffset = 0;
	    public Home theHome = new Home();

	 @Override
	    public void start(Stage stage) throws Exception {
		 final URL rootURL = getClass().getResource("/application/kittenproject.fxml");
		 
		 final Settings modelSettings = new Settings();

	        FXMLLoader loader = new FXMLLoader(rootURL);
//	        loader.setLocation(getClass().getResource("sample.fxml"));
	        loader.setLocation(rootURL);
	        loader.setControllerFactory(new Callback<Class<?>, Object>() {
	            @Override
	            public Object call(Class<?> aClass) {
	                return new menuBoxController(modelSettings);
	            }
	        });

	        stage.initStyle(StageStyle.UNDECORATED);
		 	stage.setTitle("Kitten-Construction");
		 	stage.getIcons().add(new Image("application/resources/constructlogo.png"));
	        Parent root = (Parent) FXMLLoader.load(getClass().getResource("kittenproject.fxml")); //maybe the issue


	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.setResizable(false);
	        
	        
	        stage.show();
	        
	       
	      
	        

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

	 	public void changeScene(String A, MouseEvent event) throws IOException {
	 		Parent newb = FXMLLoader.load(getClass().getResource(A));
	        Scene newbScene = new Scene(newb);
	        //This line gets the Stage information
	        myStage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        //sets new scene
	        myStage.setScene(newbScene);
	        myStage.show();
	        
		      //grab your root here
	        newbScene.setOnMousePressed(new EventHandler<MouseEvent>() {
	           @Override
	           public void handle(MouseEvent event) {
	               xOffset = event.getSceneX();
	               yOffset = event.getSceneY();
	           }
	       });

	       //move around here
	        newbScene.setOnMouseDragged(new EventHandler<MouseEvent>() {
	           @Override
	           public void handle(MouseEvent event) {
	               myStage.setX(event.getScreenX() - xOffset);
	               myStage.setY(event.getScreenY() - yOffset);
	           }
	       });
	 	}

	 	public String getVersion() {
	 		return Double.toString(version);
	 	}
	 	


		public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
//			new Home(true);
	    	//remove (this is a test. Build real Junit test)!!!!
//	    	Home test = new Home();
	    	
//	    	test.exportJSON(new File(Home.HOME_PATH));
//	    	test.importJSON(new File(Home.HOME_PATH));
//	    	System.out.println(test.myElectricBill);
	    	
//	    	String testPath = "save" + File.separatorChar + "settings.json";
//	    	Settings testSettings = new Settings();
//	    	testSettings.exportSettings(new File(testPath));
//	    	testSettings.importSettings(new File(testPath));
//	    	System.out.println(testSettings.getMyEmailAddress());
//	    	System.out.println("Working Directory = " +
//	                System.getProperty("user.dir"));
	    	launch(args);
	    	
	    }
}
