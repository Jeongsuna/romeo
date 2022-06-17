package C80AA_CloneThrowsCloneNotSupporte;

import java.util.*;

public class CloneThrowsCloneNotSupportedException_BAD {
    public class MyClass implements Cloneable{
        public Object clone() throws CloneNotSupportedException {
            CloneThrowsCloneNotSupportedException_GOOD.MyClass clone = (CloneThrowsCloneNotSupportedException_GOOD.MyClass)super.clone();
            return clone;
        }
    }
}
