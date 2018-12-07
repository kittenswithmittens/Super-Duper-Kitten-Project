/**
 * FileChooser DIY - Utility class for returning the File specified by the user for import/export
 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */
package application;
import java.io.File;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
 

public final class FileChooserDIY {    

    /**
     * @param theStage
     * @return the non-null file specified by the user
     */
    public static File specOpenFile(final Stage theStage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open");
        File file = fileChooser.showOpenDialog(theStage);
        return file;
    }

    /**
     * @param theStage
     * @return the non-null file specified by the user
     */
    public static File specSaveFile(final Stage theStage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save");
        File file = fileChooser.showSaveDialog(theStage);
        return file;
    }
    
    
   
}