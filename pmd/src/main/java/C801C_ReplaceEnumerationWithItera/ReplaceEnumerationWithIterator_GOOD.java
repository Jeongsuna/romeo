package C801C_ReplaceEnumerationWithItera;

import java.util.ArrayList;
import java.util.Iterator;

public class ReplaceEnumerationWithIterator_GOOD {
    public static class Bar {
        public static void main(String[] args) {
            ArrayList foo = new ArrayList();
            Iterator it = foo.iterator();

            while(it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}
