package C9045_REQMAPPINGMETHOD;

import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

public class REQMAPPINGMETHOD_GOOD {

  @RequestMapping(value = "/greet", method = GET)
  public String greet(String greetee) {
    // do something
    return null;
  }
  
}