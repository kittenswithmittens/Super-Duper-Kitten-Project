package application;

import java.io.File;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Settings implements Exportable {

	private StringProperty myName;
	private StringProperty myEmailAddress;

	// import/export fields
//	private final ObjectMapper myMapper;
//	private final ObjectReader myReader;
//	private final ObjectWriter myWriter;

	private final Exporter myExporter;

	/**
	 * @author Isaiah Miller
	 */
	public Settings() {
		// sets up JSON object mapper
//		myMapper = new ObjectMapper();
//		myReader = myMapper.readerForUpdating(this);
//		myWriter = myMapper.writerWithDefaultPrettyPrinter();

		myName = new SimpleStringProperty();
		myEmailAddress = new SimpleStringProperty();
		myExporter = new Exporter(this);
	}

	/**
	 * Imports home data from save file into to this instance.
	 * 
	 * @author Isaiah Miller
	 */
	public void importJSON(final File srcFile) {
		myExporter.importFile(srcFile);
	}

	// Pre-refactor style
//		File srcFile = new File(Home.HOME_PATH);
//		try {
//			myReader.readValue(srcFile);
//		} catch (IOException e) {
//			System.out.println("Import failed... Making new Home save file.");
//			exportSettings();
//			e.printStackTrace();
//		}
//	}

	/**
	 * @author Isaiah Miller
	 */
	public void exportJSON(final File destFile) {
		myExporter.exportFile(destFile);
	}

//		File destFile = new File(Home.HOME_PATH);
//		try {
//			myWriter.writeValue(destFile, this);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	// getters and setters

	public String getMyName() {
		return myName.getValue();
	}

	public void setMyName(String theName) {
//		System.out.println(myName);
		myName.setValue(theName);
	}

//	public StringProperty myNameProperty() {
//		return myName;
//	}

	public String getMyEmailAddress() {
		return myEmailAddress.getValue();
	}

	public void setMyEmailAddress(String theEmailAddress) {
		if (theEmailAddress != null) {
			myEmailAddress.setValue(theEmailAddress);
		}
	}

//	public StringProperty myEmailAddressProperty() {
//		return myEmailAddress;
//	}
}
