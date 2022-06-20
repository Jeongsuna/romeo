package C80E1_SuspiciousEqualsMethodName;

public class SuspiciousEqualsMethodName_BAD {
    public class Foo {
        public boolean equals(Object o) {
            return false;
        }
        public boolean equals(String s) {
            return false;
        }
        public boolean equals(Object o1, Object o2) {
            return false;
        }
    }
}
