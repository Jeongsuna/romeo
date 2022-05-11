package C9045_REQMAPPINGMETHOD;

public class REQMAPPINGMETHOD_BAD {

  @RequestMapping("/greet", method = GET)
  private String greet(String greetee) {
    // do something
  }
  
}