package C9038_CHECKINDEXOF;

import java.util.ArrayList;
import java.util.List;

public class CHECKINDEXOF_Bad {

    String color = "blue";
    String name = "ishmael";

    public void method() {
        List<String> strs = new ArrayList<String>();
        strs.add(color);
        strs.add(name);

        if (strs.indexOf(color) > 0) {  // Noncompliant
            // ...
        }
        if (name.indexOf("ish") > 0) { // Noncompliant
            // ...
        }
        if (name.indexOf("ae") > 0) { // Noncompliant
            // ...
        }
    }
}
