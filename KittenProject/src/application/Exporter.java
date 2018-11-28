package application;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * @author Isaiah Miller
 */
public class Exporter {
	//import/export fields
		private final ObjectMapper myMapper;
		private final ObjectReader myReader;
		private final ObjectWriter myWriter;
		
		private final Object myDestObject;
		
		/**
		 * must instantiate one of this for a class to use
		 * @author Isaiah Miller
		 */
		public Exporter(Object destObject) {
			// sets up JSON object mapper
			myMapper = new ObjectMapper();
			myReader = myMapper.readerForUpdating(destObject);
			myWriter = myMapper.writerWithDefaultPrettyPrinter();
			myDestObject = destObject;
		}

		/**
		 * Imports home data from save file into to this instance.
		 * 
		 * @author Isaiah Miller
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
		 * @author Isaiah Miller
		 */
		public void exportFile(File destFile) {
			try {
				myWriter.writeValue(destFile, myDestObject);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
