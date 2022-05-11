package C901F_NOTSERIALIZECLASS;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class NOTSERIALIZECLASS_GOOD {
    public class Fruit implements Serializable {
        public String getName() {
            return null;
        }  // can now be serialized
        //...
    }

    public class Menu {
        public void meal() throws IOException {
            Fruit fru = new Fruit();
            //...
            FileOutputStream fout = new FileOutputStream(fru.getName());
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(fru);
        }
    }
}
