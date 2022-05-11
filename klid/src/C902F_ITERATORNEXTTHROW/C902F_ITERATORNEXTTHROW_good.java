package C902F_ITERATORNEXTTHROW;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class C902F_ITERATORNEXTTHROW_good implements Iterator<String> {

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return "";
    }

    @Override
    public boolean hasNext() {
        return false;
    }

}
