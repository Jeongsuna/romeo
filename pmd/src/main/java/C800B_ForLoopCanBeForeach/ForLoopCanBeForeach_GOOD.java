package C800B_ForLoopCanBeForeach;

import java.util.List;

public class ForLoopCanBeForeach_GOOD {
    public class Foo {
        void loop(List<String> l) {
            for (int i = 0; i < l.size(); i++) {
                System.out.println(l.get(i));
            }
        }
    }
}
