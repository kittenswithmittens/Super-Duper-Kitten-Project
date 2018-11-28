package application;

import java.io.File;

/**
 * @author Isaiah Miller
*/
public interface Exportable {	
	public void exportJSON(File destFile);
	public void importJSON(File srcFile);
}
