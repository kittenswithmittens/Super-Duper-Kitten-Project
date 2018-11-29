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
	private final ObjectMapper mapper;

	public JSONMapper() {
		this.mapper = new ObjectMapper();
	}

	/**
	 * @author Isaiah Miller
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
	 * @author Isaiah Miller
	 * Writes home to a file in JSON format.
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
