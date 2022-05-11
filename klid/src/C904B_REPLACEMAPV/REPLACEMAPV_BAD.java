package C904B_REPLACEMAPV;

import java.util.Map;

public class REPLACEMAPV_BAD {
    public void bad(Map letters, String[] towns, int i) {
        letters.put("a", "Apple");
        letters.put("a", "Airport");  // Noncompliant

        towns[i] = "NewYork";
        towns[i] = "Paris";  // Noncompliant
    }
}
