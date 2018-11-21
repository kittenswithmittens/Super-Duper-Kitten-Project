package application;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Exporter {
	//import/export fields
		private final ObjectMapper myMapper;
		private final ObjectReader myReader;
		private final ObjectWriter myWriter;
		
		/**
		 * must instantiate one of this for a class to use
		 * @author Isaiah Miller
		 */
		public Exporter(Object destObject) {
			// sets up JSON object mapper
			myMapper = new ObjectMapper();
			myReader = myMapper.readerForUpdating(destObject);
			myWriter = myMapper.writerWithDefaultPrettyPrinter();
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
				myWriter.writeValue(destFile, this);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
