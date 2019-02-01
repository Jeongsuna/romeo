using System;
using System.Xml;

namespace Romeo.CWE643_Xpath_Injection
{
    class CWE643_Xpath_Injection__Simple_01 : System.Web.UI.Page
    {
        void bad()
        {
            // Load the document and set the root element.  
            XmlDocument doc = new XmlDocument();
            doc.Load("employees.xml");
            XmlNode root = doc.DocumentElement;

            String username = Request["Username"];
            String password = Request["Password"];

            String FindUserXPath = "//Employee[UserName/text()='" + username
                + "' And Password / text() = '" + password + "']";
            var user = root.SelectNodes(FindUserXPath);

            foreach(var u in user)
            {
                Console.WriteLine(u);
            }
        }

        void good()
        {
            // Load the document and set the root element.  
            XmlDocument doc = new XmlDocument();
            doc.Load("employees.xml");
            XmlNode root = doc.DocumentElement;

            String username = Request["Username"];
            String password = Request["Password"];

            String FindUserXPath = "//Employee[UserName/text()='" + username.Replace("'", "&apos;")
                + "' And Password / text() = '" + password.Replace("'", "&apos;") + "']";
            var user = root.SelectNodes(FindUserXPath);

            foreach (var u in user)
            {
                Console.WriteLine(u);
            }
        }
        
    }
}
