package C8079_LoosePackageCoupling.LoosePackage;

import C8079_LoosePackageCoupling.LoosePackageCouplingTest.other.DontUseThisClass;

public class LoosePackageCoupling_BAD {
    public class Bar {
        DontUseThisClass boo = new DontUseThisClass();
    }
}
