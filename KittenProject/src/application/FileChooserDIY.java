package application;

import java.io.File;
import java.util.Objects;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
 
/**
 * Utility class for returning the File specified by the user for import/export
 * @author Rich Williams
 * @author Isaiah Miller
 */
public final class FileChooserDIY {    
	/**
	 * @return the non-null file specified by the user
	 * @author Rich Williams
	 * @author Isaiah Miller
	 */
    public static File specOpenFile(final Stage theStage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open");
        File file = fileChooser.showOpenDialog(theStage);
        Objects.requireNonNull(file);
        return file;
    }
    
    /**
	 * @return the non-null file specified by the user
	 * @author Isaiah Miller
	 */
    public static File specSaveFile(final Stage theStage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save");
        File file = fileChooser.showSaveDialog(theStage);
//        Objects.requireNonNull(file);
        return file;
    }
    
    
   
}