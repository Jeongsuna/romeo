using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE767_Access_to_Critical_Private_Variable_via_Public_Method
{
    class CWE767_Access_to_Critical_Private_Variable_via_Public_Method__simple_01
    {
        private float price;
        public void bad(float newPrice)
        {
            // FLAW:
            price = newPrice;
        }

        private void good(float newPrice)
        {
            price = newPrice;
        }
    }
}
