package C902F_ITERATORNEXTTHROW;

import java.util.Iterator;

public class C902F_ITERATORNEXTTHROW_bad implements Iterator<String> {


    public String next() {
        if (!hasNext()) {
            return null;
        }
        return "";
    }

    @Override
    public boolean hasNext() {
        return false;
    }

}
