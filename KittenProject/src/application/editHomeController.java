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

import javafx.scene.input.KeyEvent;

import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/*
 * should contain an instance of Settings
 * Should contain an instance of FileChooserDIY which it will pass 
 * the settings instance to
 */

public class editHomeController extends Main implements Initializable {
    //Heat
    @FXML RadioButton gasHeater;
    @FXML RadioButton electricHeater;
    @FXML RadioButton radiantHeater;
    @FXML CheckBox msFurnace;
    @FXML CheckBox houseFan;
    @FXML CheckBox pThermostat;
    //Water
    @FXML RadioButton gasWater;
    @FXML RadioButton electricWater;
    @FXML RadioButton onDemandWater;
    //Light
    @FXML RadioButton incandLights;
    @FXML RadioButton ledLights;
    @FXML RadioButton halogenLights;
    @FXML RadioButton florLights;
    @FXML TextField numLights;
    //Windows and Doors
    @FXML CheckBox wpDoors;
    @FXML TextField numWindows;
    @FXML TextField numBadWindows;
    //Insulation
    @FXML CheckBox iWalls;
    @FXML CheckBox iCeiling;
    @FXML CheckBox iFloors;
    //Irrigation
    @FXML CheckBox irrigationSensor;
    //Appliances
    @FXML CheckBox eStarFridge;
    @FXML CheckBox eStarWasher;
    @FXML CheckBox eStarDryer;
    @FXML CheckBox eStarDish;
    
    private double xOffset = 0;
    private double yOffset = 0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //gasHeater.setText("" + theHome.getMyElectricBill());
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
        //iFloors.setSelected(theHome.isMyInsulationFloor());
        //
        irrigationSensor.setSelected(theHome.isMyIrrigationSensor());
        //
        eStarFridge.setSelected(theHome.isMyEStarRefrig());
        eStarWasher.setSelected(theHome.isMyEStarClothWash());
        eStarDryer.setSelected(theHome.isMyEStarDryer());
        eStarDish.setSelected(theHome.isMyEStarDishWash());
    }
    
    @FXML
    void saveClose(MouseEvent arg0) throws IOException {
        //theHome.setMyElectricBill(Float.parseFloat(gasHeater.getText()));
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
        //theHome.setMyInsulationFloor(iFloors.isSelected());
        //
        theHome.setMyIrrigationSensor(irrigationSensor.isSelected());
        //
        theHome.setMyEStarRefrig(eStarFridge.isSelected());
        theHome.setMyEStarClothWash(eStarWasher.isSelected());
        theHome.setMyEStarDryer(eStarDryer.isSelected());
        theHome.setMyEStarDishWash(eStarDish.isSelected());
        changeScene("list.fxml", arg0);
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
}
