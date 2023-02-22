package C9069_HARDFILEPATH__HardCodingFilePath;

import common.Config;

public class C9069_HARDFILEPATH_HardCodingFilePath_good {
    public static final String PATH = "/home/Standard/some.xml";

    private void gooddMethod(String path) {
        if(PATH.equals(path)){ // @fixed
            System.out.println("path is correct");
        }
    }

    public void someMethod() {
        String var = Config.getString("path"); // @fixed
    }
}
