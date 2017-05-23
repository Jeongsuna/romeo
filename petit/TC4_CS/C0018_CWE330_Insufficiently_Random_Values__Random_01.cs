using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE330_Insufficiently_Random_Values
{
    class CWE330_Insufficiently_Random_Values__Random_01
    {
        public void bad()
        {
            // FLAW:
            Random rnd = new Random();
            for (int ctr = 0; ctr <= 20; ctr++)
                Console.WriteLine(rnd.Next(10));
        }

        public void good(int seed)
        {
            // FIX:
            Random rnd = new Random(seed);
            for (int ctr = 0; ctr <= 20; ctr++)
                Console.WriteLine(rnd.Next(10));
        }
    }
}
