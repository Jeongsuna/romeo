package C9038_CHECKINDEXOF;

import java.util.ArrayList;
import java.util.List;

public class CHECKINDEXOF_Good {

    String color = "blue";
    String name = "ishmael";

    public void method() {
        List<String> strs = new ArrayList<String>();
        strs.add(color);
        strs.add(name);

        if (strs.indexOf(color) > -1) {
            // ...
        }
        if (name.indexOf("ish") >= 0) {
            // ...
        }
        if (name.contains("ae")) {
            // ...
        }
    }
}
