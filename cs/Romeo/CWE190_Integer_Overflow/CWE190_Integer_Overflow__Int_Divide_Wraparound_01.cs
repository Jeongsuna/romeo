using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE190_Integer_Overflow
{
    class CWE190_Integer_Overflow__Int_Divide_Wraparound_01
    {
        public void bad()
        {
            // FLAW: 
            float result = 3 / 2;
            Console.WriteLine("3 / 2 = " + result);
        }

        public void good()
        {
            float result = (float)3 / 2;
            Console.WriteLine("3 / 2 = " + result);
        }
    }
}
