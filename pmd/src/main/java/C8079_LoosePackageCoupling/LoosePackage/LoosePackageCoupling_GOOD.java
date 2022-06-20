package C8079_LoosePackageCoupling.LoosePackage;
import C8079_LoosePackageCoupling.LoosePackage.other.UseThisClass;
public class LoosePackageCoupling_GOOD {
    public class Bar {
        UseThisClass boo = new UseThisClass();
    }
}
