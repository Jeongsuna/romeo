package C8100_BooleanInstantiation;

public class BooleanInstantiation_Bad {

    public void foo() {
        Boolean bar = new Boolean("true");        // unnecessary creation, just reference Boolean.TRUE;
    }

}
