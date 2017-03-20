using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


    public partial class CWE80_XSS__Simple_01 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            string id = Request.QueryString["id"] as string;

            if (id == null)
            {
                IdLabel.Text = "NA";
            }
            else
            {
                IdLabel.Text = id;
            }
        }
        protected void SubmitButtonClick(object sender, EventArgs e)
        {
            MsgLabel.Text = "Hello " + NameTextBox.Text;
        }
    }
