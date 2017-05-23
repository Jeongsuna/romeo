using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE571_Expression_Always_True
{
    class CWE571_Expression_Always_True__Always_True_Cond_01
    {
        public void bad(String productNumber)
        {
            bool isProductAvailable = false;
            bool isDelayed = false;

            if (productInStore(productNumber))
            {
                isProductAvailable = true;
                updateInStoreDatabase(productNumber);
            }
            else if (productInWarehouse(productNumber))
            {
                isProductAvailable = true;
                updateInWarehouseDatabase(productNumber);
            }
            else
            {
                isProductAvailable = true;
            }

            // FLAW: isProductAvailable is always true
            if (isProductAvailable)
            {
                updateProductDatabase(productNumber);
            }
            else if (isDelayed)
            {
                Console.WriteLine("delayed...");
            }
        }

        private void updateProductDatabase(string productNumber)
        {
            Console.WriteLine("update product db: " + productNumber);
        }

        private void updateInWarehouseDatabase(string productNumber)
        {
            Console.WriteLine("update warehouse db: " + productNumber);
        }

        private bool productInWarehouse(string productNumber)
        {
            return true;
        }

        private bool productInStore(string productNumber)
        {
            return true;
        }

        private void updateInStoreDatabase(string productNumber)
        {
            Console.WriteLine("update: " + productNumber);
        }
    }
}
