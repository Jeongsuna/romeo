package C8058_UnnecessaryAnnotationValueE;

public class UnnecessaryAnnotationValueElement_BAD {
    @TestClassAnnotation(value = "TEST")
    public class Foo {
        @TestMemberAnnotation(value = "TEST")
        private String y;
        @TestMethodAnnotation(value = "TEST")
        public void bar() {
            int x = 42;
            return;
        }
    }
}

