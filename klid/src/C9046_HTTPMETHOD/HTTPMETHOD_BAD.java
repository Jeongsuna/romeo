package C9046_HTTPMETHOD;

public class HTTPMETHOD_BAD {
  @RequestMapping("/delete_user")  // Sensitive: by default all HTTP methods are allowed
  public String deleteUser1(String username) {
  // state of the application will be changed here
  }

  @RequestMapping(path = "/delete_user", method = {RequestMethod.GET, RequestMethod.POST}) // Sensitive: both safe and unsafe methods are allowed
  String deleteUser2(@RequestParam("id") String userId) {
  // state of the application will be changed here
  }
}