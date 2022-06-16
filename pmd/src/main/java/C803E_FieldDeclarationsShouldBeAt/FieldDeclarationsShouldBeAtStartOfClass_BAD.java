package C803E_FieldDeclarationsShouldBeAt;

public class FieldDeclarationsShouldBeAtStartOfClass_BAD {
    public class HelloWorldBean {
        public String getMessage() {
            return "Hello World!";
        }
        private String bar;
    }
}
