package C800B_ForLoopCanBeForeach;

import java.util.List;

public class ForLoopCanBeForeach_BAD {
    public class Foo {
        void loop(List<String> l) {
            for (String str : l) {
                System.out.println(str);
            }
        }
    }
}
