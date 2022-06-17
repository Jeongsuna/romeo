package C80A6_ClassCastExceptionWithToArr;

import java.util.ArrayList;
import java.util.Collection;

public class ClassCastExceptionWithToArray_GOOD {
    public class Foo{
        Collection c = new ArrayList();
        Integer obj = new Integer(1);

        Integer[] b = (Integer [])c.toArray(new Integer[c.size()]);
    }
}
