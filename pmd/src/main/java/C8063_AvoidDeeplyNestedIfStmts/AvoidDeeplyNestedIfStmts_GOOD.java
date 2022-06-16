package C8063_AvoidDeeplyNestedIfStmts;

public class AvoidDeeplyNestedIfStmts_GOOD {
    public class Foo {
        public void bar(int x, int y, int z) {
            if (x>y && y>z && z==x) {
                x += z;
            }
        }
    }
}
