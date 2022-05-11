package C9046_HTTPMETHOD;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class HTTPMETHOD_GOOD {
  @RequestMapping(value = "/delete_user", method = RequestMethod.POST)  // Compliant
  public String deleteUser1(String username) {
    // do something.
    return "200 OK";
  }

  @RequestMapping(path = "/delete_user", method = RequestMethod.POST) // Compliant
  String deleteUser2(@RequestParam("id") String userId) {
    // do something.
    return "200 OK";
  }
}