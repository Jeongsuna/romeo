using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web.UI;

namespace Romeo.CWE601_Open_Redirect
{
    public partial class CWE601_Open_Redirect__Simple_01__Good : Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            string[] allowURL = { "http://safe1.com", "http://safe2.com", "http://safe3.com" };
            string url = Request.QueryString["url"];
            if(allowURL.Contains(url))
                Response.Redirect(url);
        }
    }
}
