package C9044_USEFILEEXIST;

import java.io.File;
import java.nio.file.Path;

public class USEFILEEXIST_BAD {
  
  public static void main(String[] args) {
    Path myPath = (new File("/").toPath());
    if(java.nio.file.Files.exists(myPath)) {  // Noncompliant
    // do something
    }
  }

}