using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web.UI;

namespace Romeo.CWE601_Open_Redirect
{
    public partial class CWE601_Open_Redirect__Simple_01__Bad : Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            string url = Request.QueryString["url"];
            Response.Redirect(url);
        }
        

    }
}
