package C9012_ITERATORCALL;

import java.util.Iterator;

public class ITERATORCALL_GOOD {
    public class IteratorTest implements Iterator<Integer> {
        //...
        @Override
        public boolean hasNext() {
            if(getNext() != false) {
                return true;
            }
            return false;
        }

        @Override
        public Integer next() {
            return null;
        }

        public boolean getNext() {
            return false;
        }
        //...
    }
}
