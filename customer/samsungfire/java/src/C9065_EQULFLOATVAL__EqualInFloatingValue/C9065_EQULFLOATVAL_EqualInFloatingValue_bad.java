package C9065_EQULFLOATVAL__EqualInFloatingValue;

public class C9065_EQULFLOATVAL_EqualInFloatingValue_bad {
    private void badMethod(double param){
        if (0 == Double.compare(param, 45.5D)) { // @fixed
            doSomething();
        }
    }

    private void doSomething(){
        System.out.println("print test");
    }
}
