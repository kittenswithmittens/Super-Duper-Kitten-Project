package application;

import java.io.File;
import java.net.URL;

/**
 * @author Isaiah Miller Date: 12/4/18 makes a config file with paths to
 *         persistent data.
 */
public class Config implements Exportable {
	private String mySourcePath;
	private String mySavePath;
	private String myHomePath;
	private String mySettingsPath;

	private final Exporter myExporter;

	/**
	 * Date: 12/5/18
	 * 
	 * @author Isaiah Miller
	 */
	public Config() {
		myExporter = new Exporter(this);
		mySourcePath = retConfigPath();
//		final File sourceFile = new File(mySourcePath);
//		myExporter.importFile(sourceFile);

		mySourcePath = retConfigPath();
		mySavePath = retSavePath();
		System.out.println("mySource path is: " + mySourcePath);

	}

	public String getMySourcePath() {
		return mySourcePath;
	}

	public void setMySourcePath(String mySourcePath) {
		this.mySourcePath = mySourcePath;
	}

	public String getMySavePath() {
		return mySavePath;
	}

	public void setMySavePath(String mySavePath) {
		this.mySavePath = mySavePath;
	}

	public String getMyHomePath() {
		return myHomePath;
	}

	public void setMyHomePath(String myHomePath) {
		this.myHomePath = myHomePath;
	}

	public String getMySettingsPath() {
		return mySettingsPath;
	}

	public void setMySettingsPath(String mySettingsPath) {
		this.mySettingsPath = mySettingsPath;
	}

	public String retSavePath() {
		final URL saveURL = getClass().getResource("save");
		System.out.println("my URL save path is: " + saveURL.getPath());
		return saveURL.getPath();
	}

	/**
	 * Date 12/5/18
	 * 
	 * @author Isaiah Miller
	 * @return The path to source the project configuration from.
	 */
	public String retConfigPath() {
		// path should be src/application/save/config.json
//		new File(getClass().getResource("save").getPath());
		return getClass().getResource("save/config.json").getPath();
	}

	/*
	 * Date 12/8/18
	 * 
	 * @author Isaiah Miller
	 */
	@Override
	public void exportJSON(File destFile) {
		myExporter.exportFile(destFile);
	}

	/*
	 * Date: 12/8/18
	 * 
	 * @author Isaiah Miller
	 */
	@Override
	public void importJSON(File srcFile) {
		myExporter.importFile(srcFile);
	}

	/*
	 * Date: 12/8/18
	 * 
	 * @author Isaiah Miller
	 */
	@Override
	public boolean equals(Object other) {
		System.out.println("in correct equals method");
		boolean res;
		if (other == null || other.getClass() != this.getClass()) {
			res = false;
		} else { // check all fields equal (except exporter)
			Config otherConfig = (Config) other;
			final boolean sourceIsSame = mySourcePath.equals(otherConfig.mySourcePath);
			final boolean saveIsSame = mySavePath.equals(otherConfig.mySavePath);
			final boolean settingsIsSame = mySettingsPath.equals(otherConfig.mySettingsPath);
			final boolean homeIsSame = myHomePath.equals(otherConfig.myHomePath);
			res = sourceIsSame && saveIsSame && settingsIsSame && homeIsSame;
		}
		return res;
	}

	/*
	 * Date: 12/8/18
	 * 
	 * @author Isaiah Miller
	 */
	@Override
	public String toString() {
		final String res = "My home path: " + myHomePath + "\nMy Settings Path: " + mySettingsPath + "\nmy Source Path: "
				+ mySourcePath + "\nmy Save Path: " + mySavePath + "\n";
		return res;
	}

}
