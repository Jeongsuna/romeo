using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE259_Hard_Coded_Password
{
    class CWE259_Hard_Coded_Password__equals_01
    {
        public static bool bad(string pass)
        {
            bool result = false;
            string password = pass;
            for (int i = 0; i < 3; i++)
            {
                if (password.Equals("654321" + i))
                    result = true;
                else
                    result = false;
            }
            return result;
        }
    }
}
