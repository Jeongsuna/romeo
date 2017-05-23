using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE321_Hard_Coded_Cryptographic_Key
{
    class CWE321_Hard_Coded_Cryptographic_Key__Equals_01
    {
        int bad(String password)
        {
            // FLAW
            if (password == "68af404b513073584c4b6f22b6c63e6b")
            {
                Console.WriteLine("Entering Diagnostic Mode...");
                return (1);
            }
            Console.WriteLine("Incorrect Password!");
            return (0);
        }
    }
}
