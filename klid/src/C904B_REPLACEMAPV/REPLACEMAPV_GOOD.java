package C904B_REPLACEMAPV;

import java.util.Map;

public class REPLACEMAPV_GOOD {
    public void bad(Map letters, String[] towns, int i) {
        letters.put("a", "Apple");
        // letters.put("a", "Airport");

        towns[i] = "NewYork";
        // towns[i] = "Paris";
    }
}
