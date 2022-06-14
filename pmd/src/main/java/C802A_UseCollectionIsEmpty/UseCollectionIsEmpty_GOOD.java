package C802A_UseCollectionIsEmpty;

import java.util.List;

public class UseCollectionIsEmpty_GOOD {
    public class Test {
        void testMethod() {
            List bar = getList();
            if (bar.isEmpty()) {
            }
        }
    }
    private List getList() {
        return null;
    }
}
