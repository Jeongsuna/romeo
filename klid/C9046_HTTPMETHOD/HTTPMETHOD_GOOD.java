package C9046_HTTPMETHOD;

public class HTTPMETHOD_GOOD {
  @RequestMapping("/delete_user", method = RequestMethod.POST)  // Compliant
  public String deleteUser1(String username) {
    // do something.
  }

  @RequestMapping(path = "/delete_user", method = RequestMethod.POST) // Compliant
  String deleteUser2(@RequestParam("id") String userId) {
    // do something.
  }
}