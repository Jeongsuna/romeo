package C8065_AvoidThrowingNewInstanceOfS;

public class AvoidThrowingNewInstanceOfSameException_BAD {
    public void bar() throws Exception {
        try {
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
