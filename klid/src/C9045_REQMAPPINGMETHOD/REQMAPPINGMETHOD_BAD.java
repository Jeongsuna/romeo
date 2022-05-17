package C9045_REQMAPPINGMETHOD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class REQMAPPINGMETHOD_BAD {

  @RequestMapping(value = "/greet", method = GET)
  private String greet(String greetee) {
      // do something
      return null;
  }

  @GetMapping("/greet")
  private String greet2(String greetee) {
      // do something
      return null;
  }

  @PutMapping("/greet")
  private String greet3(String greetee) {
      // do something
      return null;
  }

  @DeleteMapping("/greet")
  private String greet4(String greetee) {
      // do something
      return null;
  }

  @PatchMapping("/greet")
  private String greet5(String greetee) {
      // do something
      return null;
  }

  @PostMapping("/greet")
  private String greet6(String greetee) {
      // do something
      return null;
  }
}