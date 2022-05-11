package C901F_NOTSERIALIZECLASS;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NOTSERIALIZECLASS_BAD {
    public class Fruit {
        public String getName() {
            return null;
        }  // neither implements Serializable nor extends a class that does
        //...

    }

    public class Menu {
        public void meal() throws IOException {
            Fruit fru = new Fruit();
            //...
            FileOutputStream fout = new FileOutputStream(fru.getName());
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(fru);  // Noncompliant. Nothing will be written
        }
    }
}
