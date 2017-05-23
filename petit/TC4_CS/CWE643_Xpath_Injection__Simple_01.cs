using System;
using System.Xml;

namespace Romeo.CWE643_Xpath_Injection
{
    class CWE643_Xpath_Injection__Simple_01
    {
        void bad()
        {
            // Load the document and set the root element.  
            XmlDocument doc = new XmlDocument();
            doc.Load("employees.xml");
            XmlNode root = doc.DocumentElement;

            String FindUserXPath = "//Employee[UserName/text()='" + Request("Username")
                + "' And Password / text() = '" + Request("Password") + "']";
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

            String FindUserXPath = "//Employee[UserName/text()='" + Request("Username").Replace("'", "&apos;")
                + "' And Password / text() = '" + Request("Password").Replace("'", "&apos;") + "']";
            var user = root.SelectNodes(FindUserXPath);

            foreach (var u in user)
            {
                Console.WriteLine(u);
            }
        }

        private string Request(string param)
        {
            return "";
        }
    }
}
