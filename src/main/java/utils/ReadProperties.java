package utils;

import constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

//make the class final so no can change it
public final class ReadProperties {

    private ReadProperties(){}
    private static  Properties properties= new Properties();
    static {
        FileInputStream fs= null;
        try {
            fs = new FileInputStream(FrameworkConstants.getConfigFilePath());
            properties.load(fs);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String getValue(String key) throws Exception {
        String value="";

        value = properties.getProperty(key);
        if(Objects.isNull(value)){
            throw new Exception("Property name "+key+ "is not found. Please check config.properties");

        }
        return value;
    }

}
