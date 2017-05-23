using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE477_Use_of_Obsolete_Functions
{
    class CWE477_Use_of_Obsolete_Functions__Obsolete_Attribute_Method_01
    {
        public void bad()
        {
            // Flaw: use obsolete function
            oldCopy();
        }

        public void good()
        {
            newCopy();
        }

        [Obsolete("not used anymore")]
        public void oldCopy()
        {

        }
        public void newCopy()
        {

        }
    }
}
