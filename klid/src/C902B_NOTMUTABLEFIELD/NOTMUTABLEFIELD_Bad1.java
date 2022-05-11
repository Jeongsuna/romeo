package C902B_NOTMUTABLEFIELD;

import javax.servlet.http.HttpServlet;

public class NOTMUTABLEFIELD_Bad1 extends HttpServlet {
    public class MyClass extends HttpServlet {
        private String userName;  //As this field is shared by all users, it's obvious that this piece of information should be managed differently
//  ...
    }


}
