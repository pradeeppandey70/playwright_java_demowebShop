package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private static final Properties prop = new Properties();
	private static final String path = System.getProperty("user.dir")+"/src/main/resources/config/config.properties";
	
	static {
		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		}catch(IOException e) {
			System.out.println("Config File not found");
		}
	}
	
	public static String getConfig(String key) {
		return prop.getProperty(key);
		
	}

}
