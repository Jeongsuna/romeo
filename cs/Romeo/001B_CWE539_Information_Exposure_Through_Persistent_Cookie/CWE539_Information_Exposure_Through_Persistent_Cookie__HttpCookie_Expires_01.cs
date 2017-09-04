using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Romeo._001B_CWE539_Information_Exposure_Through_Persistent_Cookie
{
    // 출처: 소프트웨어 개발보안 가이드(2017.01)
    class CWE539_Information_Exposure_Through_Persistent_Cookie__HttpCookie_Expires_01 : Page
    {
        TextBox UserInput;
        struct UserInfo
        {
            public long id;
        }
        UserInfo objUser;
        
        private void Bad(object sender, EventArgs e)
        {
            int hours = Int32.Parse(UserInput.Text);
            HttpCookie myCookie = new HttpCookie("myCookie");
            myCookie.Values.Add("userid", objUser.id.ToString());
            // FLAW:
            myCookie.Expires = DateTime.Now.AddHours(hours);
            Response.Cookies.Add(myCookie);
        }

        private void Good(object sender, EventArgs e)
        {
            int hours = Int32.Parse(UserInput.Text);
            HttpCookie myCookie = new HttpCookie("myCookie");
            myCookie.Values.Add("userid", objUser.id.ToString());
            myCookie.Expires = DateTime.Now.AddHours(hours);
            // FIX:
            myCookie.Secure = true;
            Response.Cookies.Add(myCookie);
        }

    }
}
