package C80FE_AvoidUsingShortType;

public class AvoidUsingShortType_Bad {
    private short doNotUseShort = 0;

    public void UsingShort() {
        short shouldNotBeUsed = 1;
        doNotUseShort += shouldNotBeUsed;
    }
}
