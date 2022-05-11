package C9026_CALLCOLLECTION;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CALLCOLLECTION_BAD {
    public static void main(String[] args) {
        String foo = "42";
        Map<Integer, Object> map = new HashMap<>();
        map.remove(foo); // Noncompliant; will return 'null' for sure because 'map' is handling only Integer keys

        // ...

        List<String> list = new ArrayList<String>();
        Integer i = Integer.valueOf(1);
        if (list.contains(i)) { // Noncompliant; always false.
            list.remove(i); // Noncompliant; list.add(i) doesn't compile, so this will always return 'false'
        }
    }
}
