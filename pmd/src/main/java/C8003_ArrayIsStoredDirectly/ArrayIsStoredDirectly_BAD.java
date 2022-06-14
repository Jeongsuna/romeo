package C8003_ArrayIsStoredDirectly;

public class ArrayIsStoredDirectly_BAD {
    public class Test {
        private String [] str;
        public void bar (String [] param) {
            this.str=param;
        }
    }
}
