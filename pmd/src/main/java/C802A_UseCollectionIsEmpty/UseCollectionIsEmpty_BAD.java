package C802A_UseCollectionIsEmpty;

import java.util.List;

public class UseCollectionIsEmpty_BAD {
    public class Test {
        void testMethod() {
            List bar = getList();
            if (bar.size() == 0) {
            }
        }
    }

    private List getList() {
        return null;
    }
}
