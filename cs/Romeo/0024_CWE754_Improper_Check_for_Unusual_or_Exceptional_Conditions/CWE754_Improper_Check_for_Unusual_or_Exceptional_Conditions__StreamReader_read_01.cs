using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web.Security;

namespace Romeo.CWE754_Improper_Check_for_Unusual_or_Exceptional_Conditions
{
    class CWE754_Improper_Check_for_Unusual_or_Exceptional_Conditions__StreamReader_read_01
    {
        private string PFILE_ROOT;

        public void bad(MembershipUserCollection users)
        {
            char[] byteArray = new char[1024];
            for (IEnumerator i = users.GetEnumerator(); i.MoveNext(); )
            {
                String userName = (String)i.Current;
                String pFileName = PFILE_ROOT + "/" + userName;
                StreamReader sr = new StreamReader(pFileName);
                // FLAW: ignore return value
                sr.Read(byteArray, 0, 1024);//the file is always 1k bytes
                sr.Close();
                processPFile(userName, byteArray);
            }
        }

        public void good(MembershipUserCollection users)
        {
            char[] byteArray = new char[1024];
            for (IEnumerator i = users.GetEnumerator(); i.MoveNext();)
            {
                String userName = (String)i.Current;
                String pFileName = PFILE_ROOT + "/" + userName;
                StreamReader sr = new StreamReader(pFileName);
                
                int status = sr.Read(byteArray, 0, 1024);//the file is always 1k bytes
                sr.Close();
                processPFile(userName, byteArray);
                // FIX: if the file is smaller than byteArray's size clear all bits
                if (status == 0)
                    byteArray.Initialize();
            }
        }

        private void processPFile(string userName, char[] byteArray)
        {
            throw new NotImplementedException();
        }
    }

}
