package C8015_LooseCoupling;
import java.util.ArrayList;
import java.util.HashSet;

public class LooseCoupling_BAD {
    public class Foo {
        private ArrayList<String> list = new ArrayList<>();

        public HashSet<String> getBar() {
            return new HashSet<String>();
        }
    }
}
