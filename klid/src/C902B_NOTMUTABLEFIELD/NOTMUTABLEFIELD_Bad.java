package C902B_NOTMUTABLEFIELD;

import javax.servlet.http.HttpServlet;
import org.apache.struts.action.Action;

public class NOTMUTABLEFIELD_Bad {
    public class MyClass extends HttpServlet {
        private String userName;  //As this field is shared by all users, it's obvious that this piece of information should be managed differently
//  ...
    }

    public class MyClass2 extends Action {
        private String userName;
//  ...
    }

}
