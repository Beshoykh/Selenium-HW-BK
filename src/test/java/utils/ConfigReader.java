package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
  public static String read (String key) throws IOException {
      FileInputStream file = new FileInputStream(Constants.CONFIG_FILE_PATH);
      Properties properties = new Properties();
      properties.load(file);
      return properties.getProperty(key);
  }
}
