package C8002_AccessorMethodGeneration;

public class AccessorMethodGeneration_BAD {
    public class OutClass {
        private int count;

        class InClass {
            InClass() {
                OutClass.this.count++;
            }
        }
    }
}
