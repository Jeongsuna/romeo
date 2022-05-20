package C9046_HTTPMETHOD;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class HTTPMETHOD_BAD {
  @RequestMapping("/delete_user")  // Sensitive: by default all HTTP methods are allowed
  public String deleteUser1(String username) {
    // state of the application will be changed here
    return "200 OK";
  }

  @RequestMapping(path = "/delete_user", method = {RequestMethod.GET, RequestMethod.POST}) // Sensitive: both safe and unsafe methods are allowed
  String deleteUser2(@RequestParam("id") String userId) {
    // state of the application will be changed here
    return "200 OK";
  }

  @RequestMapping(path = "/delete_user", method = RequestMethod.GET) // Sensitive: both safe and unsafe methods are allowed
  String deleteUser3(@RequestParam("id") String userId) {
    // state of the application will be changed here
    return "200 OK";
  }
}