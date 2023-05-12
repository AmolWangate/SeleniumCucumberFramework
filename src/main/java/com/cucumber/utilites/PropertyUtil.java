package com.cucumber.utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cucumber.customexception.InputOutputException;
import com.cucumber.customexception.FileNotFoundException;

public final class PropertyUtil {

	private PropertyUtil() {

	}
	
	private static final Logger LOG = LogManager.getLogger();

	public static Properties loadPropertiesFile(String filePath) {
		Properties properties = new Properties();
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(filePath);
			properties.load(inputStream);
		} catch (FileNotFoundException e) {
			LOG.fatal("File could not be found");
			throw new FileNotFoundException(e.getMessage());
		} catch (IOException e) {
			LOG.fatal("Error while reading property file");
			throw new InputOutputException(e.getMessage());
		}
		return properties;

	}
}
