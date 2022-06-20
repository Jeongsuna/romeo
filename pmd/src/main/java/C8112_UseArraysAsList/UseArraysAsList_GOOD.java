package C8112_UseArraysAsList;

import java.util.Arrays;
import java.util.List;

public class UseArraysAsList_GOOD {
    public class Test {
        public void foo(Integer[] ints) {
            List<Integer> l = Arrays.asList(ints);
            for (int i = 0; i < ints.length; i++) {
                l.add(ints[i]);
            }
        }
    }
}
