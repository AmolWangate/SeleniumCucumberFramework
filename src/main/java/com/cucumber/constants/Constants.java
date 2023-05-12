package com.cucumber.constants;

import java.io.File;

public final class Constants {

	private Constants() {

	}

	private static final String PROPERTIES_FOLDER_PATH = System.getProperty("user.dir") + File.separator + "src"
			+ File.separator + "test" + File.separator + "resources" + File.separator + "properties";
	private static final String ENV_PROPERTY_FILE_PATH = PROPERTIES_FOLDER_PATH + File.separator + "Env.properties";
	private static final int PAGE_TIMEOUT = 60;
	private static final int EXPLICIT_WAIT = 40;

	public static int getPageTimeout() {
		return PAGE_TIMEOUT;
	}

	public static int getExplicitWait() {
		return EXPLICIT_WAIT;
	}

	public static String getEnvPropertyFilePath() {
		return ENV_PROPERTY_FILE_PATH;
	}
}
