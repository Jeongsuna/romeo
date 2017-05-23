using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE496_Public_Data_Assigned_to_Private_Array_Typed_Field
{
    class CWE496_Public_Data_Assigned_to_Private_Array_Typed_Field__Simple01
    {
        private string[] userRoles;
        public void bad(string[] userRoles)
        {
            this.userRoles = userRoles;
        }
    }
}
