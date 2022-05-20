package C9026_CALLCOLLECTION;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CALLCOLLECTION_GOOD {
    public static void main(String[] args) {
        Integer foo = Integer.valueOf("42");
        Map<Integer, Object> map = new HashMap<>();
        // do something
        map.remove(foo);

        // ...
        List<String> list = new ArrayList<String>();
        String i = String.valueOf(1);
        if (list.contains(i)) { // Compliant
            list.remove(i); // Compliant
        }
    }
}
