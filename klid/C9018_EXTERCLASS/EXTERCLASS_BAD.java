package C9018_EXTERCLASS;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EXTERCLASS_BAD {
    public class Potato implements Externalizable {

        public Potato (int size, String color) {
            //...
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {

        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        }
    }
}
