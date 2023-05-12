package com.cucumber.utilites;

import java.util.Objects;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cucumber.constants.Constants;
import com.cucumber.constants.Property;
import com.cucumber.customexception.InvalidKeyException;

public class ConfigLoader {

	private static ConfigLoader configLoader;
	private Properties properties;

	private static final Logger LOG = LogManager.getLogger();

	private ConfigLoader() {
		properties = PropertyUtil.loadPropertiesFile(Constants.getEnvPropertyFilePath());
	}

	public static ConfigLoader getInstance() {
		if (configLoader == null) {
			configLoader = new ConfigLoader();
		}
		return configLoader;
	}

	public String getPropertyValue(Property key) {
		if (Objects.isNull(key) || Objects.isNull(properties.getProperty(key.name().toLowerCase()))) {
			LOG.fatal("Please check the key again");
			throw new InvalidKeyException("Please check the key again");
		}
		LOG.info("Key: " + key + " & value: " + properties.getProperty(key.name().toLowerCase()));
		return properties.getProperty(key.name().toLowerCase());

	}
}
