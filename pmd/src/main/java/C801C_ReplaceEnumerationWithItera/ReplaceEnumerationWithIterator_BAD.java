package C801C_ReplaceEnumerationWithItera;

import java.util.Enumeration;
import java.util.Vector;

public class ReplaceEnumerationWithIterator_BAD {
    public static class Bar implements Enumeration {
        public static void main(String[] args) {
            Vector v = new Vector();
            Enumeration e = v.elements();
            while (e.hasMoreElements()) {
                System.out.println(e.nextElement());
            }
        }
        public boolean hasMoreElements() {
            return true;
        }
        public Object nextElement() {
            int i = 0;
            return String.valueOf(i++);
        }
    }
}
