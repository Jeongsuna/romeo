package C9069_HARDFILEPATH__HardCodingFilePath;

public class C9069_HARDFILEPATH_HardCodingFilePath_bad {

    private void badMethod(String path) {
        if("/home/Standard/some.xml".equals(path)){ // @violation
            System.out.println("path is correct");
        }
    }
}
