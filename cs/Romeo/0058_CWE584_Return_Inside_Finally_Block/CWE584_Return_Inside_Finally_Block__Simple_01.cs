using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE584_Return_Inside_Finally_Block
{
    class CWE584_Return_Inside_Finally_Block__Simple_01
    {
        void bad()
        {
            try
            {
                throw new NullReferenceException();
            }
            finally
            {
                return;
            }
        }
        void good()
        {

        }
    }
}
