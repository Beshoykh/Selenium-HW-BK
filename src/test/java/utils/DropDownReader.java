package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DropDownReader {
    public static String dropDownRead(String browser) throws IOException {
        FileInputStream file = new FileInputStream(Constants.DROP_DOWN_FILE_PATH);
        Properties properties = new Properties();
        properties.load(file);
        return properties.getProperty(browser);

    }
}
