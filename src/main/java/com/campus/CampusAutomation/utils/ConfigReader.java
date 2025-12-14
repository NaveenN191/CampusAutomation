package com.campus.CampusAutomation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;

    public static Properties initializeProperties() {
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream("src/test/resources/config.properties");
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}