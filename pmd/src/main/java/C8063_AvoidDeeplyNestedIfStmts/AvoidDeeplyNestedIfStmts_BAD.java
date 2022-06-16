package C8063_AvoidDeeplyNestedIfStmts;

public class AvoidDeeplyNestedIfStmts_BAD {
    public class Foo {
        public void bar(int x, int y, int z) {
            if (x>y) {
                if (y>z) {
                    if (z==x) {
                        x += z;
                    }
                }
            }
        }
    }
}
