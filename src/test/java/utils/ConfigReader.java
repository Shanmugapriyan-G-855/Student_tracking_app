package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties properties;

    static {
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            System.out.println("Could not load config.properties file: " + e.getMessage());
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
