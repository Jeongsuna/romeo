package C8002_AccessorMethodGeneration;

public class AccessorMethodGeneration_GOOD {
    public class OutClass {
        int id;

        public class InClass {
            public int getOuterClassId() {
                return OutClass.this.id;
            }
        }
    }
}
