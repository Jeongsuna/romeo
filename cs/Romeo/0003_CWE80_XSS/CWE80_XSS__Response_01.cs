
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web.UI;

namespace Romeo._0003_CWE80_XSS
{
    // 출처: 소프트웨어 개발보안 가이드(2017.01)
    class CWE80_XSS__Response_01 :Page
    {
        public void Bad()
        {
            String userid = Request.QueryString["ID"];
            String query = "Select* From Products Where ProductID = " +userid;
            Response.Write(query);
        }

        public void Good()
        {
            String userid = Request.QueryString["ID"];
            if (userid != null && !"".Equals(userid))
            {
                userid = userid.Replace("<", "&lt;");
                userid = userid.Replace(">", "&gt;");
                userid = userid.Replace("&", "% amp;");
                userid = userid.Replace("\"", "&#quot;");
                userid = userid.Replace("’", "&#x27;");
                userid = userid.Replace("/", "&#x2F;");
            }
            String query = "Select* From Products Where ProductID = " +userid;
            Response.Write(query);
        }

    }
}
