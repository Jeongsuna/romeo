package common;

import java.util.HashMap;
import java.util.Map;

public class Config {
    public static Map<String, String> configMap = new HashMap<>();

    public static String getString(String key){
        String ret = configMap.get(key);
        if(ret == null)
            return "";

        return ret;
    }
}
