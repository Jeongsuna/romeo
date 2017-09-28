using System;
using System.Collections.Generic;
using System.DirectoryServices;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web.UI;

namespace Romeo._0009_CWE90_LDAP_Injection
{
    // 출처: 소프트웨어 개발보안 가이드(2017.01)
    class CWE90_LDAP_Injection__DirectorySearcher_Filter_02: Page
    {
        public string Bad()
        {
            string loginName = Request.QueryString["Name"];
            DirectoryEntry root = new DirectoryEntry("GC://DC=fasoo,DC=com");

            DirectorySearcher searcher = new DirectorySearcher();
            root.AuthenticationType = AuthenticationTypes.Secure;
            searcher.SearchRoot = root;
            
            // FLAW:
            searcher.Filter = string.Format("(name ={ 1})", loginName);
            SearchResult result = searcher.FindOne();

            string userName = result.Properties["cn"][0].ToString();
            root.Close();
            return userName;
        }
        public string Good()
        {
            string loginName = Request.QueryString["Name"];
            DirectoryEntry root = new DirectoryEntry("GC://DC=fasoo,DC=com");
            DirectorySearcher searcher = new DirectorySearcher();
            root.AuthenticationType = AuthenticationTypes.Secure;
            searcher.SearchRoot = root;
            if (loginName == null || "".Equals(loginName))
                return null;

            loginName = loginName.Replace("=", "");
            loginName = loginName.Replace("+", "");
            loginName = loginName.Replace("<", "");
            loginName = loginName.Replace(">", "");
            loginName = loginName.Replace("#", "");
            loginName = loginName.Replace(";", "");
            loginName = loginName.Replace("\\", "");
            loginName = loginName.Replace("*", "");

            searcher.Filter = string.Format("(name ={ 1})", loginName);
            SearchResult result = searcher.FindOne();
            string userName = result.Properties["cn"][0].ToString();
            root.Close();
            return userName;
        }
    }
}
