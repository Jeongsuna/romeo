package C9016_SERIALIZEFIELD;

import java.io.Serializable;

public class SERIALIZEFIELD_GOOD {
    public class Address implements Serializable {
        private static final long serialVersionUID = 2405172041950251807L;
    }

    public class Employee implements Serializable {
        private static final long serialVersionUID = 1905122041950251207L;

        private String user;
        private Address address;
    }
}
