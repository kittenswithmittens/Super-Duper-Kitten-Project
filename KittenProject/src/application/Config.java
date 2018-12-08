package application;

import java.io.File;

/**
 * @author Isaiah Miller
 * Date: 12/4/18
 * makes a config file with paths to persistent data.
 */
public class Config {
	final String myPath;
	
	public Config() {
		myPath = getConfigPath();
		System.out.println(myPath);
//		System.out.println("Panic!");
	}
	
	public String getConfigPath() {
		//path should be src/application/save/config.json
		System.out.println(getClass().getResource("save"));
//		new File(getClass().getResource("save").getPath());
		return getClass().getResource("save/config.json").getPath();
	}

}
