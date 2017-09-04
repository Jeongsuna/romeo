using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web;
using System.Web.UI;

namespace Romeo._000D_CWE807_Reliance_on_Untrusted_Inputs_in_a_Security_Decision
{
    // 출처: 소프트웨어 개발보안 가이드(2017.01)
    class CWE807_Reliance_on_Untrusted_Inputs_in_a_Security_Decision__Cookie_01 : Page
    {
        string userRole;
        public void Bad()
        {
            HttpCookieCollection cookies = Request.Cookies;
            for (int i = 0; i < cookies.Count; i++)
            {
                HttpCookie c = cookies[i];
                if (c.Name.Equals("role"))
                {
                    userRole = c.Value;
                }
            }
        }

        public void Good()
        {
            if (!IsPostBack && (Request.Cookies["__LOGINCOOKIE__"] == null || Request.Cookies["__LOGINCOOKIE__"].Value == ""))
            {
                Session.Abandon();
                Response.Cookies.Add(new HttpCookie("ASP.NET_SessionId", ""));
                AddRedirCookie();
                Response.Redirect(Request.Path);
            }
        }

        private void AddRedirCookie()
        {
            throw new NotImplementedException();
        }
    }
}
