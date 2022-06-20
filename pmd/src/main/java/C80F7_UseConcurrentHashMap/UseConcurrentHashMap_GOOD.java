package C80F7_UseConcurrentHashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UseConcurrentHashMap_GOOD {
    public class ConcurrentApp {
        public void getMyInstance() {
            Map map2 = new ConcurrentHashMap();
        }
    }
}
