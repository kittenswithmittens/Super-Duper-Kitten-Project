package test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import application.Config;
import application.Settings;

/**
 * Date 11/30/18
 * @author Isaiah Miller
 */
public class ExportImportTester {
	public static final String EXPORT = "export";
	public static final String TYPICAL = "typical.json";
	private static final String TYPICAL_CONFIG = "typicalConfig.json";
	Settings myActualSettings;

	/**
	 * Date 11/30/18
	 * @author Isaiah Miller
	 */
	@Before
	public void init() {
		myActualSettings = new Settings();
	}

	/**
	 * @author Isaiah Miller
	 */
	@Test
	public void importTypical() {
		final Settings expectedSettings = typicalSettings();
		final URL testURL = getClass().getResource(TYPICAL);
		myActualSettings.importJSON(new File(testURL.getPath()));
		assertEquals(expectedSettings, myActualSettings);
	}
	
	
	/**
	 * Date:12/8/18
	 * @author Isaiah Miller
	 */
	@Test
	public void importConfig() {
		final Config expected = typicalConfig();
		final URL testURL = getClass().getResource(TYPICAL_CONFIG);
		final Config actual = new Config();
		actual.importJSON(new File(testURL.getPath()));
		assertEquals(expected, actual);
	}

	
	
	
	
	
	/**
	 * Date: 12/8/18
	 * @author Isaiah Miller
	 */
	@Test
	public void exportConfig() {
		//export typical file
		final Config expected = typicalConfig();
		final Config origConfig = typicalConfig();
		final String destPathEnding  = EXPORT + "/" + TYPICAL_CONFIG;
//		System.out.println("destPathEnding is: " + destPathEnding);
		final URL testURL = getClass().getResource(destPathEnding);
		origConfig.exportJSON(new File(testURL.getPath()));
		
		//import file to new object and test against expected
		final Config actual = new Config();
		actual.importJSON(new File(testURL.getPath()));
		assertEquals(expected, actual);
	}
	
	/**
	 * @author Isaiah Miller
	 * @return
	 */
	private static Settings typicalSettings() {
		final Settings res = new Settings();
		res.setMyEmailAddress("myemail@gmail.com");
		res.setMyName("Bob");
		return res;
	}
	
	/**
	 * Date: 12/8/18
	 * @author Isaiah Miller
	 * @return
	 */
	private static Config typicalConfig() {
		final Config res = new Config();
//		private String mySourcePath;
//		private String mySavePath;
//		private String myHomePath;
//		private String mySettingsPath
		res.setMyHomePath("/Home");
		res.setMySavePath("/Save");
		res.setMySettingsPath("/Settings");
		res.setMySourcePath("/source");
		return res;
	}

	/**
	 * @author Isaiah Miller
	 * @throws FileNotFoundException
	 */
	@Test
	public void exportTypical() throws FileNotFoundException {
		myActualSettings = typicalSettings();
//		System.out.println("Base URL path: " + getClass().getResource(""));
		final String testURLPath = EXPORT + "/" + "typExp.json";
		URL testURL = getClass().getResource(testURLPath);
//		System.out.println("typ export path " + testURLPath);
//		System.out.println(testURL);
		final String filePath = testURL.getPath();
		myActualSettings.exportJSON(new File(filePath));

		Scanner out = new Scanner(new File(testURL.getPath()));
		out.useDelimiter("\\Z");
		final String actual = out.next();

		URL testURL2 = getClass().getResource(TYPICAL);
		Scanner in = new Scanner(new File(testURL2.getPath()));
		in.useDelimiter("\\Z");
		final String expected = in.next();
		in.close();
		assertEquals(expected, actual);
		out.close();
	}

	/**
	 * @author Isaiah Miller
	 * @throws FileNotFoundException
	 */
	@Test
	public void exportNull() throws FileNotFoundException {
		final String nullFileName = "null";
		exportFile(nullFileName);
	}

	/**
	 * @author Isaiah Miller
	 * @param fileName
	 * @throws FileNotFoundException
	 */
	private void exportFile(final String fileName) throws FileNotFoundException {
		if (fileName != "null") {
			myActualSettings = inMemSettings(fileName);
		} else {
			myActualSettings.setMyEmailAddress("");
			myActualSettings.setMyName("");
		}
		URL testURL = getClass().getResource(EXPORT + "/" + fileName + ".json");
		final String filePath = testURL.getPath();
		myActualSettings.exportJSON(new File(filePath));

		Scanner out = new Scanner(new File(testURL.getPath()));
		out.useDelimiter("\\Z");
		final String actual = out.next();

//		System.out.println(getClass().getResource(""));
//		System.out.println(fileName.length());
		URL testURL2 = getClass().getResource(fileName + ".json");
//		System.out.println(testURL2);
//		System.out.println(testURL2.getPath());
		String expected;
		if (fileName != "null") {
			Scanner in = new Scanner(new File(testURL2.getPath()));
			in.useDelimiter("\\Z");
			expected = in.next();
			in.close();
		} else {
			URL testURLNull = getClass().getResource("nullExp" + ".json");
			Scanner in = new Scanner(new File(testURLNull.getPath()));
			in.useDelimiter("\\Z");
			expected = in.next();
			in.close();
		}
		assertEquals(expected, actual);
		out.close();
	}

	/**
	 * @author Isaiah Miller
	 * @param fileName
	 */
	private void importFile(final String fileName) {
		final Settings actualSettings = new Settings();
		final Settings expectedSettings = typicalSettings();
		URL testURL = getClass().getResource(fileName + ".json");
		actualSettings.importJSON(new File(testURL.getPath()));
		assertEquals(expectedSettings, actualSettings);
	}

	/**
	 * @author Isaiah Miller
	 * @param fileName
	 * @return
	 */
	private static Settings inMemSettings(final String fileName) {
		final Settings res = new Settings();
		res.setMyEmailAddress(fileName + "@gmail.com");
		res.setMyName(fileName);
		return res;
	}
}
