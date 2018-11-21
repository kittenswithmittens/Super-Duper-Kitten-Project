package application;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
 
/**
 * this needs a reference to instance that the file will be read into
 *
 */
public final class FileChooserDIY extends Application {
 
    private Desktop desktop = Desktop.getDesktop();
 
    
    //returns the File selected
    @Override
    public void start(final Stage stage) {
//        stage.setTitle("Profile File Chooser");
// 
//        final FileChooser fileChooser = new FileChooser();
 
//        final Button openButton = new Button("Open a profile");
//        final Button openMultipleButton = new Button("Open Pictures...");
 
//        openButton.setOnAction(
//            new EventHandler<ActionEvent>() {
//                @Override
//                public void handle(final ActionEvent e) {
//                    File file = fileChooser.showOpenDialog(stage);
//                    if (file != null) {
//                        openFile(file);
//                    }
//                }
//            });
 

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Home Profile");
 //       fileChooser.showOpenDialog(stage);
        
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
        	openFile(file);
        }
        
//        openMultipleButton.setOnAction(
//            new EventHandler<ActionEvent>() {
//                @Override
//                public void handle(final ActionEvent e) {
//                    List<File> list =
//                        fileChooser.showOpenMultipleDialog(stage);
//                    if (list != null) {
//                        for (File file : list) {
//                            openFile(file);
//                        }
//                    }
//                }
//            });
 
 
//        final GridPane inputGridPane = new GridPane();
// 
//        GridPane.setConstraints(openButton, 0, 0);
//        GridPane.setConstraints(openMultipleButton, 1, 0);
//        inputGridPane.setHgap(6);
//        inputGridPane.setVgap(6);
//        inputGridPane.getChildren().addAll(openButton, openMultipleButton);
// 
//        final Pane rootGroup = new VBox(12);
//        rootGroup.getChildren().addAll(inputGridPane);
//        rootGroup.setPadding(new Insets(12, 12, 12, 12));
// 
//        stage.setScene(new Scene(rootGroup));
//        stage.show();
    }
 
//    public static void main(String[] args) {
//        Application.launch(args);
//    }
 
    private void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException ex) {
        	System.out.println("Opening" + file);
        	
 //       	Settings.importSettings(file);
        	
//            Logger.getLogger(
//                FileChooserSample.class.getName()).log(
//                    Level.SEVERE, null, ex
//                );
        }
    }
}