package C80D7_OverrideBothEqualsAndHashco;

public class OverrideBothEqualsAndHashcode_BAD {
    public class Bar {
        public boolean equals(Object o) {
            return false;
        }
    }
    public class Foo {
        public int hashCode() {
            return 0;
        }
    }
}
