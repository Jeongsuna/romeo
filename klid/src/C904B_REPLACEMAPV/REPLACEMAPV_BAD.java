package C904B_REPLACEMAPV;

import java.util.Map;
import java.util.HashMap;

public class REPLACEMAPV_BAD {
    HashMap<String, String> map3;

    public void foo(Map letters, String[] towns, int i, HashMap<String, String> map2) {

        letters.put("a", "Apple");letters.put("a", "Airport");
        letters.put("a", "Airport");  // Noncompliant
                    letters.put("a", "Airport");
        if(i == 10) {
            letters.put("a", "AirportX");  // Noncompliant
        }

        towns[i] = "NewYork";
        towns[i] = "Paris";  // Noncompliant

        map3.put("a", "Apple");

        letters.put("a", "Airport");  // Noncompliant

        map2.put("a", "Apple");
        map2.put("a", "Airport");  // Noncompliant

        map3.put("a", "Airport2");
        map3.put("a", "Airport");  // Noncompliant


    }

}
