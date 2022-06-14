package C8015_LooseCoupling;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LooseCoupling_GOOD {
    public class Foo {
        private List<String> list = new ArrayList<>();

        public Set<String> getBar() {
            return new HashSet<String>();
        }
    }
}
