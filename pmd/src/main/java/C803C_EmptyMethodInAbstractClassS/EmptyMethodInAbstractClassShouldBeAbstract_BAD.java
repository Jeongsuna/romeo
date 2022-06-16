package C803C_EmptyMethodInAbstractClassS;

public class EmptyMethodInAbstractClassShouldBeAbstract_BAD {
    public /*abstract*/ class AbstractTest {
        public Object couldBeAbstract1() {
            return null;
        }
        public void couldBeAbstract2() {
        }
    }
}
