using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE369_Divide_By_Zero
{
    class CWE369_Divide_By_Zero__Simple_01
    {
        int bad(int x, int y)
        {
            return (x / y);
        }
        int good(int x, int y)
        {
            try
            {
                return (x / y);
            }
            catch (System.DivideByZeroException dbz)
            {
                System.Console.WriteLine("Division by zero attempted!");
                return 0;
            }
        }
    }
}
