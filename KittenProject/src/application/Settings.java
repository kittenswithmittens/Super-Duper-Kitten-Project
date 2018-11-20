package application;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;

public class Settings {

	
	private String myName;
	private String myEmailAddress;
	
	//import/export fields
	private final ObjectMapper myMapper;
	private final ObjectReader myReader;
	private final ObjectWriter myWriter;
	
	/**
	 * @author Isaiah Miller
	 */
	public Settings() {
		// sets up JSON object mapper
		myMapper = new ObjectMapper();
		myReader = myMapper.readerForUpdating(this);
		myWriter = myMapper.writerWithDefaultPrettyPrinter();
	}

	/**
	 * Imports home data from save file into to this instance.
	 * 
	 * @author Isaiah Miller
	 */
	public void importSettings() {

		File srcFile = new File(Home.HOME_PATH);
		try {
			myReader.readValue(srcFile);
		} catch (IOException e) {
			System.out.println("Import failed... Making new Home save file.");
			exportSettings();
//			e.printStackTrace();
		}
	}

	/**
	 * @author Isaiah Miller
	 */
	public void exportSettings() {
		File destFile = new File(Home.HOME_PATH);
		try {
			myWriter.writeValue(destFile, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
