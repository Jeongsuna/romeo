package C9065_EQULFLOATVAL__EqualInFloatingValue;

public class C9065_EQULFLOATVAL_EqualInFloatingValue_good {
    private void badMethod(double param){
        if (param == 45.5) { // @violation
            doSomething();
        }
    }

    private void doSomething(){
        System.out.println("print test");
    }
}
