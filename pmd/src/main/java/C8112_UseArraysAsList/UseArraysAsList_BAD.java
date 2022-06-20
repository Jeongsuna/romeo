package C8112_UseArraysAsList;

import java.util.ArrayList;
import java.util.List;

public class UseArraysAsList_BAD {
    public class Test {
        public void foo(Integer[] ints) {
            List<Integer> l = new ArrayList<>(100);
            for (int i = 0; i < ints.length; i++) {
                l.add(ints[i]);
            }
        }
    }
}
