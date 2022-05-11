package C9052_REQMMETHODARG;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class REQMMETHODARG_GOOD {

  private final PurchaseRepository session;

  public REQMMETHODARG_GOOD(PurchaseRepository session) {
    this.session = session;
  }

  @PostMapping(path = "/save")
  public String save(PurchaseDTO pDto) {
    Purchase pWish = new Purchase();

    // do the mapping between "pDto" and "pWish"
    //...

    session.save(pWish);

    return "Ok";
  }

  @RequestMapping(path = "/save2", method = RequestMethod.POST)
  public String save2(PurchaseDTO pDto) {
    Purchase pWish = new Purchase();

    // do the mapping between "pDto" and "pWish"
    //...

    session.save(pWish);

    return "Ok";
  }
}