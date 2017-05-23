using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE595_Comparison_of_Object_References_Instead_of_Object_Contents
{
    public interface IMyInterface
    {
    }

    public class MyClass : IMyInterface
    {
        int a = 3;
        public override bool Equals(object obj)
        {
            return obj is MyClass;
        }
    }

    class CWE595_Comparison_of_Object_References_Instead_of_Object_Contents__simple_01
    {
        public static void bad(MyClass instance1, MyClass instance2)
        {
            // FLAW: will do reference equality check, but was that intended? MyClass overrides Equals.
            if (instance1 == instance2)
            {
                Console.WriteLine("Equal");
            }
        }

        public static void good(MyClass instance1, MyClass instance2)
        {
            // FIXED: object.Equals checks for null and then calls the instance based Equals, so MyClass.Equals
            if (object.Equals(instance1, instance2))
            {
                Console.WriteLine("Equal");
            }
        }
    }
}
