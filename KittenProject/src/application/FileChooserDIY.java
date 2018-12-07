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
	public static final String REL_PATH = "src" + File.separatorChar + "application" +
File.separatorChar + "save";
	/**
	 * @return the non-null file specified by the user
	 * @author Rich Williams
	 * @author Isaiah Miller
	 */
	
    public static File specOpenFile(final Stage theStage) {
        FileChooser fileChooser = new FileChooser();
        final String userDir = System.getProperty("user.dir");
        //assume user.dir is: KittenProject/
        System.out.println(userDir);
        final String initDir = userDir + File.separatorChar + REL_PATH;
        System.out.println(initDir);
        System.out.println("PANIC!");
//        System.out.println("Printing  path: " + new FileChooser().getClass().getResource("application").getPath());
        fileChooser.setInitialDirectory(/*new File(FileChooser.class.getResource("save").getPath())*/new File(userDir + File.separatorChar + REL_PATH));
        fileChooser.setTitle("Open");
        File file = fileChooser.showOpenDialog(theStage);
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
        return file;
    }
    
    
   
}