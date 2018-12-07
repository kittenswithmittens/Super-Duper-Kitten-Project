/**
 * Exporter class
 * Authors: Isaiah Miller
 * version 1.0
 * 12/2018
 */

package application;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Exporter {
	//import/export fields
		/**
		 * myMapper
		 */
		private final ObjectMapper myMapper;
		/**
		 * myReader
		 */
		private final ObjectReader myReader;
		/**
		 * myWriter
		 */
		private final ObjectWriter myWriter;
		
		/**
		 * myDestObject
		 */
		private final Object myDestObject;
		
		
		/**
		 * must instantiate one of this for a class to use
		 * @param destObject
		 */
		public Exporter(Exportable destObject) {
			// sets up JSON object mapper
			myMapper = new ObjectMapper();
			myReader = myMapper.readerForUpdating(destObject);
			myWriter = myMapper.writerWithDefaultPrettyPrinter();
			myDestObject = destObject;
		}

	
		/**
		 * Imports home data from save file into to this instance.
		 * @param srcFile
		 */
		public void importFile(File srcFile) {
			try {
				myReader.readValue(srcFile);
			} catch (IOException e) {
//				System.out.println("Import failed... Making new Home save file.");
//				exportFile(srcFile);
				e.printStackTrace();
			}
		}


		/**
		 * exports the file
		 * @param destFile
		 */
		public void exportFile(File destFile) {
			try {
				myWriter.writeValue(destFile, myDestObject);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
