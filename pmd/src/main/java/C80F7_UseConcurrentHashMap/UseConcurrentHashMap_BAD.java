package C80F7_UseConcurrentHashMap;

import java.util.HashMap;
import java.util.Map;

public class UseConcurrentHashMap_BAD {
    public class ConcurrentApp {
        public void getMyInstance() {
            Map map1 = new HashMap();
        }
    }
}
