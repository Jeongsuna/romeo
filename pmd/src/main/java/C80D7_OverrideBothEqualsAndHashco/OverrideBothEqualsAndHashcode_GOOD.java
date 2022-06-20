package C80D7_OverrideBothEqualsAndHashco;

public class OverrideBothEqualsAndHashcode_GOOD {
    public class Bar{
        // override neither
    }
    public class Foo {
        public boolean equals(Object other) {
            return false;
        }
        public int hashCode() {
            return 0;
        }
    }
}
