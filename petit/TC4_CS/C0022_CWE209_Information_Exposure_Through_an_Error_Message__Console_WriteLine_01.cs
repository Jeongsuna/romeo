using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE209_Information_Exposure_Through_an_Error_Message
{
    using Romeo.testcasesupport;
    class CWE209_Information_Exposure_Through_an_Error_Message__Console_WriteLine_01
    {
        public void bad()
        {
            int num, sum = 0, r;
            Console.WriteLine("Hello, World!");
            int[] intArray = new int[7] { 2, 37, 849, 24, 42, -10, 93 };
            Array.Sort(intArray);
            foreach (int nb in intArray)
            {
                r = nb + 3;
                num = r / 10;
                sum = num + nb;
                Console.WriteLine("Current sum : " + sum);
            }

            try
            {
                int a = 0;
                int b = 1;
                throw new System.DivideByZeroException();
                for (int i = 0; i < sum; i++)
                {
                    int temp = a;
                    a = b;
                    b = temp + b;
                }
                Console.WriteLine("Fib : " + a);
            }
            catch (DivideByZeroException e)
            {
                // POTENTIAL FLAW
                Console.WriteLine(e.Message);
            }
        }

        public void good()
        {
            int num, sum = 0, r;
            Console.WriteLine("Hello, World!");
            int[] intArray = new int[7] { 2, 37, 849, 24, 42, -10, 93 };
            Array.Sort(intArray);
            foreach (int nb in intArray)
            {
                r = nb + 3;
                num = r / 10;
                sum = num + nb;
                Console.WriteLine("Current sum : " + sum);
            }

            try
            {
                int a = 0;
                int b = 1;
                throw new System.DivideByZeroException();
                for (int i = 0; i < sum; i++)
                {
                    int temp = a;
                    a = b;
                    b = temp + b;
                }
                Console.WriteLine("Fib : " + a);
            }
            catch (DivideByZeroException e)
            {
                // POTENTIAL FLAW
                Log.WriteLine(e.Message);
            }
        }
    }
}
