package application;

import java.io.File;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Isaiah Miller
 *
 */
public class Settings extends AbstractExportable {

	private StringProperty myName;
	private StringProperty myEmailAddress;

	/**
	 * @author Isaiah Miller
	 */
	public Settings() {
		myName = new SimpleStringProperty("");
		myEmailAddress = new SimpleStringProperty("");
	}




	// getters and setters

	public String getMyName() {
		return myName.getValue();
	}

	public void setMyName(String theName) {
//		System.out.println(myName);
		if(theName != null) {
			myName.setValue(theName);
		}
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
	
	/* 
	 * Date: 11/23/18
	 * @author Isaiah Miller
	 */
	@Override
	public boolean equals(Object other) {
		boolean res;
		if(other == null || other.getClass() != this.getClass()) {
			res = false;
		} else { //check all fields equal
			Settings otherSettings = (Settings) other;
			final boolean emailAddressIsEqual =
			    this.myEmailAddress.getValue().equals(otherSettings.myEmailAddress.getValue());
			final boolean nameIsEqual = this.myName.getValue().equals(otherSettings.myName.getValue());
			res = emailAddressIsEqual && nameIsEqual;
		}
		return res;
	}
	
	/* 
	 * Date: 11/23/18
	 * @author Isaiah Miller
	 */
	@Override
	public String toString() {
		return "name" + myName + ", " + "email address: " + myEmailAddress;
	}
	
	/**
	 * Date: 12/10/18
	 * @author Isaiah Miller
	 */
	public void exportJSON(File destFile) {
		System.out.println("exporting settings");
		throw new Error();
		//myExporter.exportFile(destFile);
	}
	
}
