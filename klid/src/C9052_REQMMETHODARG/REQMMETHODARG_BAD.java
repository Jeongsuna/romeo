package C9052_REQMMETHODARG;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class REQMMETHODARG_BAD {

  private final PurchaseRepository session;

  public REQMMETHODARG_BAD(PurchaseRepository session) {
    this.session = session;
  }

  @PostMapping(path = "/save")
  public String save(Purchase pp) {
    session.save(pp);
    return "Ok";
  }

  @RequestMapping(path = "/save2", method = RequestMethod.POST)
  public String save2(Purchase pp) {
    session.save(pp);
    return "Ok";
  }

}