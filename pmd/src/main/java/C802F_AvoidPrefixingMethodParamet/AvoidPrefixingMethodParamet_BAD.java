package C802F_AvoidPrefixingMethodParamet;

public class AvoidPrefixingMethodParamet_BAD {
    public class TestClass {
        public void testMethod(
                int inLeftOpe,
                FooClass outRightOpe) {
            outRightOpe.setValue(inLeftOpe * outRightOpe.getValue());
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
