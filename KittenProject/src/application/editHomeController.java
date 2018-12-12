/**
 * Edit Home Controller
 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */

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
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Shadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class editHomeController extends Main implements Initializable {
    //Heat
    /**
     * gasHeater
     */
    @FXML RadioButton gasHeater;
    /**
     * electricHeater
     */
    @FXML RadioButton electricHeater;
    /**
     * radiantHeater
     */
    @FXML RadioButton radiantHeater;
    /**
     * msFurnace
     */
    @FXML CheckBox msFurnace;
    /**
     * houseFan
     */
    @FXML CheckBox houseFan;
    /**
     * pThermostat
     */
    @FXML CheckBox pThermostat;
    //Water
    /**
     * gasWater
     */
    @FXML RadioButton gasWater;
    /**
     * electricWater
     */
    @FXML RadioButton electricWater;
    /**
     * onDemandWater
     */
    @FXML RadioButton onDemandWater;
    //Light
    /**
     * incandLights
     */
    @FXML RadioButton incandLights;
    /**
     * ledLights
     */
    @FXML RadioButton ledLights;
    /**
     * halogenLights
     */
    @FXML RadioButton halogenLights;
    /**
     * florLights
     */
    @FXML RadioButton florLights;
    /**
     * numLights
     */
    @FXML TextField numLights;
    //Windows and Doors
    /**
     * wpDoors
     */
    @FXML CheckBox wpDoors;
    /**
     * numWindows
     */
    @FXML TextField numWindows;
    /**
     * numBadWindows
     */
    @FXML TextField numBadWindows;
    //Insulation
    /**
     * iWalls
     */
    @FXML CheckBox iWalls;
    /**
     * iCeiling
     */
    @FXML CheckBox iCeiling;
    /**
     * iFloors
     */
    @FXML CheckBox iFloors;
    //Irrigation
    /**
     * irrigationSensor
     */
    @FXML CheckBox irrigationSensor;
    //Appliances
    /**
     * eStarFridge
     */
    @FXML CheckBox eStarFridge;
    /**
     * eStarWasher
     */
    @FXML CheckBox eStarWasher;
    /**
     * eStarDryer
     */
    @FXML CheckBox eStarDryer;
    /**
     * eStarDish
     */
    @FXML CheckBox eStarDish;
    
    /**
     * xOffset
     */
    private double xOffset = 0;
    /**
     * yOffset
     */
    private double yOffset = 0;
    
    /**
	 * Initialize function, called at the start
	 * poplates fields with home values
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        gasHeater.setSelected(myMainHome.isMyMainHeatGas());
        electricHeater.setSelected(myMainHome.isMyMainHeatElect());
        radiantHeater.setSelected(myMainHome.isMyMainHeatRadiant());
        msFurnace.setSelected(myMainHome.isMyFurnanceMultStage());
        houseFan.setSelected(myMainHome.isMyHouseFan());
        pThermostat.setSelected(myMainHome.isMyProgThermostat());
        //
        gasWater.setSelected(myMainHome.isMyGasWaterHeater());
        electricWater.setSelected(myMainHome.isMyElectWaterHeat());
        onDemandWater.setSelected(myMainHome.isMyOnDemand());
        //
        incandLights.setSelected(myMainHome.getMyIncandLight());
        ledLights.setSelected(myMainHome.getMyLEDLight());
        halogenLights.setSelected(myMainHome.getMyHalLight());
        numLights.setText("" + myMainHome.getMyTotalLight());
        //
        wpDoors.setSelected(myMainHome.getMyWeatherProofedDoor());
        numWindows.setText("" + myMainHome.getMyNumWindow());
        numBadWindows.setText("" + myMainHome.getMyNumWindowBad());
        //
        iWalls.setSelected(myMainHome.isMyInsulationWall());
        iCeiling.setSelected(myMainHome.isMyInsulationCeiling());
        
        //
        irrigationSensor.setSelected(myMainHome.isMyIrrigationSensor());
        //
        eStarFridge.setSelected(myMainHome.isMyEStarRefrig());
        eStarWasher.setSelected(myMainHome.isMyEStarClothWash());
        eStarDryer.setSelected(myMainHome.isMyEStarDryer());
        eStarDish.setSelected(myMainHome.isMyEStarDishWash());
    }
    
    
    /**
     * saves the home details and closes the page, returning to previous scene
     * @param arg0
     * @throws IOException
     */
    @FXML
    void saveClose(MouseEvent arg0) throws IOException {
        
        myMainHome.setMyMainHeatGas(gasHeater.isSelected());
        myMainHome.setMyMainHeatElect(electricHeater.isSelected());
        myMainHome.setMyMainHeatRadiant(radiantHeater.isSelected());
        myMainHome.setMyFurnanceMultStage(msFurnace.isSelected());
        myMainHome.setMyHouseFan(houseFan.isSelected());
        myMainHome.setMyProgThermostat(pThermostat.isSelected());
        //
        myMainHome.setMyGasWaterHeater(gasWater.isSelected());
        myMainHome.setMyElectWaterHeat(electricWater.isSelected());
        myMainHome.setMyOnDemand(onDemandWater.isSelected());
        //
        myMainHome.setMyIncandLight(incandLights.isSelected());
        myMainHome.setMyLEDLight(ledLights.isSelected());
        myMainHome.setMyHalLight(halogenLights.isSelected());
        myMainHome.setMyTotalLight(Integer.parseInt(numLights.getText()));
        //
        myMainHome.setMyWeatherProofedDoor(wpDoors.isSelected());
        myMainHome.setMyNumWindow(Integer.parseInt(numWindows.getText()));
        myMainHome.setMyNumWindowBad(Integer.parseInt(numBadWindows.getText()));
        //
        myMainHome.setMyInsulationWall(iWalls.isSelected());
        myMainHome.setMyInsulationCeiling(iCeiling.isSelected());
        
        //
        myMainHome.setMyIrrigationSensor(irrigationSensor.isSelected());
        //
        myMainHome.setMyEStarRefrig(eStarFridge.isSelected());
        myMainHome.setMyEStarClothWash(eStarWasher.isSelected());
        myMainHome.setMyEStarDryer(eStarDryer.isSelected());
        myMainHome.setMyEStarDishWash(eStarDish.isSelected());
        changeScene("list.fxml", arg0);
    }

	
	/**
	 * goes back to previos page
	 * @param arg0
	 * @throws IOException
	 */
	@FXML
    void back(MouseEvent arg0) throws IOException {
        changeScene("list.fxml", arg0);
    }

    
    /**
     * closes program
     * @param event
     */
    @FXML
    void halt(MouseEvent event) {
        Platform.exit();
    }

    
    /**
     * shadows
     * @param event
     */
    @FXML
    void hoverGlow(MouseEvent event) {
        ((Node) event.getSource()).setEffect(new Glow(0.8));
    }
    
    /**
     * shadows
     * @param event
     */
    @FXML
    void hoverShadow(MouseEvent event) {
        ((Node) event.getSource()).setEffect(new Shadow(0.8, null));
    }
    

    /**
     * unshadows
     * @param event
     */
    @FXML
    void unglow(MouseEvent event) {
        ((Node) event.getSource()).setEffect(null);
    }


    /**
     * opens about page
     * @param event
     * @throws IOException
     */
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
}
