package C8003_ArrayIsStoredDirectly;

public class ArrayIsStoredDirectly_GOOD {
    public class Test {
        private String [] str;
        public void bar (String [] param) {
            String [] temp = param;
            this.str=temp;
        }
    }
}
