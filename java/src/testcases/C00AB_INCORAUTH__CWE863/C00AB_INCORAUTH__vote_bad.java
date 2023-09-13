package testcases.C00AB_INCORAUTH__CWE863;


import org.springframework.security.access.AccessDecisionVoter;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.Authentication;

import java.util.Calendar;
import java.util.Collection;

public class C00AB_INCORAUTH__vote_bad implements AccessDecisionVoter{
    @Override
    public int vote(Authentication authentication, Object object, Collection collection) {  // Noncompliant

        Calendar calendar = Calendar.getInstance();

        int currentHour = calendar.get(Calendar.HOUR_OF_DAY);

        if(currentHour >= 8 && currentHour <= 19) {
            return ACCESS_GRANTED; // Noncompliant
        }

        // when users connect during the night, do not make decision
        return ACCESS_ABSTAIN; // Noncompliant
    }

    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return false;
    }

    @Override
    public boolean supports(Class aClass) {
        return false;
    }
}
