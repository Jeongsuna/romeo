package C9044_USEFILEEXIST;

public class USEFILEEXIST_GOOD {
  
  public static void main(String[] args) {
    Path myPath;
    if(myPath.toFile().exists()) {
    // do something
    }
  }

}