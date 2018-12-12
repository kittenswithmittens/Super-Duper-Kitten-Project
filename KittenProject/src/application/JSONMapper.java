/**
 * JSON mapper
 * Authors: Logan Jenny, Rich Williams, Jake Owens, Isaiah Miller
 * version 1.0
 * 12/2018
 */
package application;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * REMOVE
 * 
 * @author Isaiah Miller
 * 
 *         Converts Java objects to and from saveable JSON representations.
 */
public class JSONMapper {
	/**
	 * mapper
	 */
	private final ObjectMapper mapper;

	/**
	 * constructor
	 */
	public JSONMapper() {
		this.mapper = new ObjectMapper();
	}

	
	/**
	 * imports home
	 * @param oldHome
	 * @return
	 */
	public Home importHome(Home oldHome) {
		File srcFile = new File(Home.HOME_PATH);
		Home result = oldHome;
		try {
			result = mapper.readValue(srcFile, Home.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	

	/**
	 * exports
	 * @author Isaiah Miller
	 * Writes home to a file in JSON format.
	 */
	/**
	 * 
	 */
	public void export() {
		File destFile = new File(Home.HOME_PATH);
		try {
			mapper.writerWithDefaultPrettyPrinter().writeValue(destFile, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//

}
