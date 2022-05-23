package C904B_REPLACEMAPV;

import java.util.Map;
import java.util.HashMap;

public class REPLACEMAPV_BAD {
    HashMap<String, String> map3;

    String x = "a"

    public void foo(Map letters, String[] towns, int i, String[][] towns2, HashMap<String, String> map2) {
        
        letters.put("a", "Apple");letters.put("a", "Airport"); // Noncompliant
        letters.put("a", "Airport");  // Noncompliant
                    letters.put("a", "Airport"); // Noncompliant
        if(i == 10) {
            letters.put("a", "AirportX");  // Noncompliant
        }

        towns[i] = "NewYork";
        towns[i] = "Paris";  // Noncompliant

        towns[2] = "NewYork";
        towns[2] = "Paris";  // Noncompliant

        map3.put("a", "Apple");

        letters.put("a", "Airport");  // Noncompliant

        map2.put("a", "Apple");
        map2.put("a", "Airport");  // Noncompliant

        map3.put("a", "Airport2"); // Noncompliant
        map3.put("a", "Airport");  // Noncompliant


        letters.put(x, "Apple");
        letters.put(x, "Banana"); // Noncompliant

    }

    public void zoo(Map letters, String[] towns, int i, String[][] towns2, HashMap<String, String> map2) {
        
        letters.put("a", "Apple");letters.put("a", "Airport"); // Noncompliant
        letters.put("a", "Airport");  // Noncompliant
                    letters.put("a", "Airport"); // Noncompliant
        if(i == 10) {
            letters.put("a", "AirportX");  // Noncompliant
        }

        towns[i] = "NewYork";
        towns[i] = "Paris";  // Noncompliant

        towns[2] = "NewYork";
        towns[2] = "Paris";  // Noncompliant

        map3.put("a", "Apple");

        letters.put("a", "Airport");  // Noncompliant

        map2.put("a", "Apple");
        map2.put("a", "Airport");  // Noncompliant

        map3.put("a", "Airport2"); // Noncompliant
        map3.put("a", "Airport");  // Noncompliant


        letters.put(x, "Apple");
        letters.put(x, "Banana"); // Noncompliant

    }

}
