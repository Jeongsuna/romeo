package C9044_USEFILEEXIST;

public class USEFILEEXIST_BAD {
  
  public static void main(String[] args) {
    Path myPath;
    if(java.nio.file.Files.exists(myPath)) {  // Noncompliant
    // do something
    }
  }

}