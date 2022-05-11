package C9052_REQMMETHODARG;


import javax.persistence.Entity;

@Entity
public class Purchase {
  Long productId;
  Long quantity;
  Client client;
}

@Entity
public class Client {
  String clientId;
  String name;
  String address;
}

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class REQMMETHODARG_BAD {

  @PostMapping(path = "/save")
  public String save(Purchase pp) {
    session.save(pp);
  }

  @RequestMapping(path = "/save", method = RequestMethod.POST)
  public String save(Purchase pp) {
    session.save(pp);
  }
}