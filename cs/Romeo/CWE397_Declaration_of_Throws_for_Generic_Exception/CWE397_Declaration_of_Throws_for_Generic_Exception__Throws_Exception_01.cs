using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE397_Declaration_of_Throws_for_Generic_Exception
{
    class CWE397_Declaration_of_Throws_for_Generic_Exception__Throws_Exception_01
    {
        public int bad(int k, int i)
        {
            if (i == 0)
                throw new Exception();
            else
                return k / i;
        }

        public int good(int k, int i)
        {
            if (i == 0)
                throw new DivideByZeroException();
            else
                return k / i;
        }
    }
}
