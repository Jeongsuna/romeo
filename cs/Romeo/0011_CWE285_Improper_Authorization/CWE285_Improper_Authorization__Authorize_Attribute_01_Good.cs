using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web.Mvc;

namespace Romeo._0011_CWE285_Improper_Authorization
{
    class CWE285_Improper_Authorization__Authorize_Attribute_01_Good: Controller
    {
        [Authorize(Roles = "Admin, Super User")]
        public ActionResult AuthCritical()
        {
            return View();
        }
    }
}
