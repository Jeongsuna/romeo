package testcases.C610E_NAMECONST;

public class C610E_NAMECONST__simple_01 {
    /* Non-compliant
     * Constants are all capitalized.
     * Combinations of two or more words are separated using undercores.
     */

    public static final int maxnum_bad = 100;

    /* Compliant */

    public static final int MAX_NUM_GOOD = 100;
}
