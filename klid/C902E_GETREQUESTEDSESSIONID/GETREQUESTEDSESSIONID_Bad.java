package C902E_GETREQUESTEDSESSIONID;

import javax.servlet.http.HttpServletRequest;

public class GETREQUESTEDSESSIONID_Bad {
    public void controller(HttpServletRequest request){
        if((request.getRequestedSessionId()) != null){
            // ...
        }
    }
}
