package C80A6_ClassCastExceptionWithToArr;

import java.util.*;

public class ClassCastExceptionWithToArray_BAD {
    public class Foo{
        Collection c = new ArrayList();
        Integer obj = new Integer(1);

        Integer[] a = (Integer [])c.toArray();
    }
}
