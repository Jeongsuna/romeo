package C9045_REQMAPPINGMETHOD;

import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class REQMAPPINGMETHOD_GOOD {

  @RequestMapping(value = "/greet", method = GET)
  public String greet(String greetee) {
      // do something
      return null;
  }

  @GetMapping("/greet")
  public String greet2(String greetee) {
      // do something
      return null;
  }

  @PutMapping("/greet")
  public String greet3(String greetee) {
      // do something
      return null;
  }

  @DeleteMapping("/greet")
  public String greet4(String greetee) {
      // do something
      return null;
  }

  @PatchMapping("/greet")
  public String greet5(String greetee) {
      // do something
      return null;
  }

  @PostMapping("/greet")
  public String greet6(String greetee) {
      // do something
      return null;
  }
  
}