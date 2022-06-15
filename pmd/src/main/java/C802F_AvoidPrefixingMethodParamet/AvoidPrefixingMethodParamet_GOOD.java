package C802F_AvoidPrefixingMethodParamet;

public class AvoidPrefixingMethodParamet_GOOD {
    public class TestClass {
        public void testMethod(
                int leftOpe,
                FooClass RightOpe) {
            RightOpe.setValue(leftOpe * RightOpe.getValue());
        }
    }
    private class FooClass{
        public int var;
        public void setValue(int value){
            var = value;
        }
        public int getValue(){
            return var;
        }
    }
}
