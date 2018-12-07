package application;

import java.io.File;

/**
 * Exportable interface
 * Authors: Isaiah Miller
 * version 1.0
 * 12/2018
 */
public interface Exportable {	
	/**
	 * export json interface
	 * @param destFile
	 */
	public void exportJSON(File destFile);
	/**
	 * import json interface
	 * @param srcFile
	 */
	public void importJSON(File srcFile);
}
