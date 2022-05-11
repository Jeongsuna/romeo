package C902C_FORLOOPINCRE;

public class FORLOOPINCRE_Bad {
    public void foo(String [] strs) {
        for (int i = 0; i < strs.length; i--) { // Noncompliant;
            String string = strs[i];  // ArrayIndexOutOfBoundsException when i reaches -1
            //...
        }
    }
}
