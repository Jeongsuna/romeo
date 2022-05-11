package C903A_UPDATESTATICFIELD;

import java.util.Date;

public class UPDATESTATICFIELD_Bad {
    static Date birth;
    static int ex;

    public UPDATESTATICFIELD_Bad(Date birthday) {
        birth = birthday;  // Noncompliant; now everyone has this birthday
        ex = 10;  // Noncompliant
    }
}
