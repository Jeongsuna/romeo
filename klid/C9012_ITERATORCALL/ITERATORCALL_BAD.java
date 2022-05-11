package C9012_ITERATORCALL;

import java.util.Iterator;

public class ITERATORCALL_BAD {
    public class IteratorTest implements Iterator<Integer> {
        //...
        @Override
        public boolean hasNext() {
            if(next() != null) {
                return true;
            }
            return false;
        }

        @Override
        public Integer next() {
            return null;
        }
        //...
    }
}
