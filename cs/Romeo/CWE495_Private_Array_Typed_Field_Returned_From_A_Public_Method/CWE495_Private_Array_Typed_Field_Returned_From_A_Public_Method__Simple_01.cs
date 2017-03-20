using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE495_Private_Array_Typed_Field_Returned_From_A_Public_Method
{
    class CWE495_Private_Array_Typed_Field_Returned_From_A_Public_Method__Simple_01
    {
        private string[] colors;
        public string[] bad()
        {
            return colors;
        }
    }
}
