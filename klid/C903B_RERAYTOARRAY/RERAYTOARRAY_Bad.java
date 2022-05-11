package C903B_RERAYTOARRAY;

import java.util.List;

public class RERAYTOARRAY_Bad {
    public String [] getStringArray(List<String> strs) {
        return (String []) strs.toArray();  // Noncompliant; ClassCastException thrown
    }
}
