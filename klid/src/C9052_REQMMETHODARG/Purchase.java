package C9052_REQMMETHODARG;

import javax.persistence.Entity;

@Entity
public class Purchase {
    Long productId;
    Long quantity;
    Client client;
}
