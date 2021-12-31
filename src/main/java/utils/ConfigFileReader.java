package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	private Properties properties;
	private final String propertyFilePath = System.getProperty("user.dir") + "//configs//Configuration.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();

			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public String getUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url is not specified in the Configuration.properties file.");

	}
	
	public String getUserId() {
		String UserId = properties.getProperty("UserId");
		if (UserId != null)
			return UserId;
		else
			throw new RuntimeException("UserId is not specified in the Configuration.properties file.");

	}
	public String getPassword() {
		String password = properties.getProperty("Password");
		if (password != null)
			return password;
		else
			throw new RuntimeException("Password is not specified in the Configuration.properties file.");

	}

	public String getBrowserName() {
		String browserName = properties.getProperty("BrowserName");
		if (browserName != null)
			return browserName;
		else
			throw new RuntimeException("Browser name is not specified in the Configuration.properties file.");
	}


}
