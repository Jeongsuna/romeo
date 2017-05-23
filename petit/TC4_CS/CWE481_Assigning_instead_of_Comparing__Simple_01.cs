using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE481_Assigning_instead_of_Comparing
{
    class CWE481_Assigning_instead_of_Comparing__Simple_01
    {
        void bad(bool isValid)
        {
            if (isValid = true)
            {
                Console.WriteLine("Performing processing");
                doSomethingImportant();
            }
            else
            {
                Console.WriteLine("Not Valid, do not perform processing");
                return;
            }
        }

        private void doSomethingImportant()
        {
            Console.WriteLine("Do Something Important");
        }

        void good(bool isValid)
        {
            if (isValid)
            {
                Console.WriteLine("Performing processing");
                doSomethingImportant();
            }
            else
            {
                Console.WriteLine("Not Valid, do not perform processing");
                return;
            }
        }
    }
}
