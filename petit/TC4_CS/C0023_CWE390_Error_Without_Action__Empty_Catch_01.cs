using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE390_Error_Without_Action
{
    class CWE390_Error_Without_Action__Empty_Catch_01
    {
        void bad()
        {
            try
            {
                int[] array = new int[] { 0, 1, 2 };
                Console.WriteLine(array[3]);
            }catch(IndexOutOfRangeException exception)
            {
            }
        }

        void good()
        {
            try
            {
                int[] array = new int[] { 0, 1, 2 };
                Console.WriteLine(array[3]);
            }
            catch (IndexOutOfRangeException exception)
            {
                Console.WriteLine("array index of bound");
            }
        }
    }
}
