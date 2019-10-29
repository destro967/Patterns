package PatternsOfCreatingObjects.Singleton;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {

    private static Configuration _instance = null;

    private Properties properties = null;

    private Configuration(){
        properties = new Properties();
        try{
            FileInputStream fis = new FileInputStream(
                    new File("properties.txt"));
            properties.load(fis);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public synchronized static Configuration getInstance(){
        if(_instance == null)
            _instance = new Configuration();

        return _instance;
    }

    public synchronized String getProperty(String key){
        String value =null;
        if (properties.containsKey(key))
            value = (String) properties.get(key);
        else{
            ///return DEFAULT
        }

        return value;
    }

}
