package C9052_REQMMETHODARG;


public class PurchaseDTO {
  Long productId;
  Long quantity;
  Long clientId;
}

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class REQMMETHODARG_GOOD {

  @PostMapping(path = "/save")
  public String save(PurchaseDTO pDto) {
    Wish pWish = new Wish();
    // do the mapping between "pDto" and "pWish"
    [...]
    session.save(pWish);
  }

  @RequestMapping(path = "/save", method = RequestMethod.POST)
  public String save(PurchaseDTO pDto) {
    Wish pWish = new Wish();
    // do the mapping between "pDto" and "pWish"
    [...]
    session.save(pWish);
  }
}