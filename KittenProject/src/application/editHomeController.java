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
        
        gasHeater.setSelected(theHome.isMyMainHeatGas());
        electricHeater.setSelected(theHome.isMyMainHeatElect());
        radiantHeater.setSelected(theHome.isMyMainHeatRadiant());
        msFurnace.setSelected(theHome.isMyFurnanceMultStage());
        houseFan.setSelected(theHome.isMyHouseFan());
        pThermostat.setSelected(theHome.isMyProgThermostat());
        //
        gasWater.setSelected(theHome.isMyGasWaterHeater());
        electricWater.setSelected(theHome.isMyElectWaterHeat());
        onDemandWater.setSelected(theHome.isMyOnDemand());
        //
        incandLights.setSelected(theHome.getMyIncandLight());
        ledLights.setSelected(theHome.getMyLEDLight());
        halogenLights.setSelected(theHome.getMyHalLight());
        numLights.setText("" + theHome.getMyTotalLight());
        //
        wpDoors.setSelected(theHome.getMyWeatherProofedDoor());
        numWindows.setText("" + theHome.getMyNumWindow());
        numBadWindows.setText("" + theHome.getMyNumWindowBad());
        //
        iWalls.setSelected(theHome.isMyInsulationWall());
        iCeiling.setSelected(theHome.isMyInsulationCeiling());
        
        //
        irrigationSensor.setSelected(theHome.isMyIrrigationSensor());
        //
        eStarFridge.setSelected(theHome.isMyEStarRefrig());
        eStarWasher.setSelected(theHome.isMyEStarClothWash());
        eStarDryer.setSelected(theHome.isMyEStarDryer());
        eStarDish.setSelected(theHome.isMyEStarDishWash());
    }
    
    
    /**
     * saves the home details and closes the page, returning to previous scene
     * @param arg0
     * @throws IOException
     */
    @FXML
    void saveClose(MouseEvent arg0) throws IOException {
        
        theHome.setMyMainHeatGas(gasHeater.isSelected());
        theHome.setMyMainHeatElect(electricHeater.isSelected());
        theHome.setMyMainHeatRadiant(radiantHeater.isSelected());
        theHome.setMyFurnanceMultStage(msFurnace.isSelected());
        theHome.setMyHouseFan(houseFan.isSelected());
        theHome.setMyProgThermostat(pThermostat.isSelected());
        //
        theHome.setMyGasWaterHeater(gasWater.isSelected());
        theHome.setMyElectWaterHeat(electricWater.isSelected());
        theHome.setMyOnDemand(onDemandWater.isSelected());
        //
        theHome.setMyIncandLight(incandLights.isSelected());
        theHome.setMyLEDLight(ledLights.isSelected());
        theHome.setMyHalLight(halogenLights.isSelected());
        theHome.setMyTotalLight(Integer.parseInt(numLights.getText()));
        //
        theHome.setMyWeatherProofedDoor(wpDoors.isSelected());
        theHome.setMyNumWindow(Integer.parseInt(numWindows.getText()));
        theHome.setMyNumWindowBad(Integer.parseInt(numBadWindows.getText()));
        //
        theHome.setMyInsulationWall(iWalls.isSelected());
        theHome.setMyInsulationCeiling(iCeiling.isSelected());
        
        //
        theHome.setMyIrrigationSensor(irrigationSensor.isSelected());
        //
        theHome.setMyEStarRefrig(eStarFridge.isSelected());
        theHome.setMyEStarClothWash(eStarWasher.isSelected());
        theHome.setMyEStarDryer(eStarDryer.isSelected());
        theHome.setMyEStarDishWash(eStarDish.isSelected());
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
