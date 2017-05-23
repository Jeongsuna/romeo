using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Romeo
{
    class CWE609_Double_Checked_Locking__Double_Null_Check_01
    {
        private static Mutex mutex = new Mutex(false, "MutexName1");
        string name;
        public string bad()
        {
            if (name == null)
            {
                lock (mutex)
                {
                    if (name == null)
                    name = LoadNameFromDatabase();
                }
            }
            return name;
        }

        public string good()
        {
            lock (mutex)
            {
                if (name == null)
                    name = LoadNameFromDatabase();
                return name;
            }
        }

        private string LoadNameFromDatabase()
        {
            throw new NotImplementedException();
        }
    }
}
