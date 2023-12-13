package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

    static {
        String dosyaYolu = "src/test/config.properties";


        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
    public String getBrowser() {
        return properties.getProperty("browser");
    }

    public String getUrl(){
        return properties.getProperty("url");
    }

    public int getIntValue(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }



}
