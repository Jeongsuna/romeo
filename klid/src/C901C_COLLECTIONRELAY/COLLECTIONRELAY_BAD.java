package C901C_COLLECTIONRELAY;

import java.util.ArrayList;
import java.util.List;

public class COLLECTIONRELAY_BAD {
    public static void main(String[] args) {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");
        objs.removeAll(objs);
    }
}
