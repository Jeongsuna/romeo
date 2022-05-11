package C9044_USEFILEEXIST;

import java.io.File;
import java.nio.file.Path;

public class USEFILEEXIST_GOOD {
  
  public static void main(String[] args) {
    Path myPath = (new File(".")).toPath();
    if(myPath.toFile().exists()) {
    // do something
    }
  }

}