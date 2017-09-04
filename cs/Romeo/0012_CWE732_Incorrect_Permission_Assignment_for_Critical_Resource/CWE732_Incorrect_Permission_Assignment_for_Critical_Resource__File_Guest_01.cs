using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Security.AccessControl;
using System.Security.Principal;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE732_Incorrect_Permission_Assignment_for_Critical_Resource
{
    class CWE732_Incorrect_Permission_Assignment_for_Critical_Resource__File_Guest_01
    {
        public void bad(string fileName)
        {
            FileSecurity fSecurityInfo = File.GetAccessControl(fileName);
            // FLAW
            fSecurityInfo.AddAccessRule(new FileSystemAccessRule(new SecurityIdentifier(WellKnownSidType.AccountGuestSid, null), FileSystemRights.FullControl, InheritanceFlags.ObjectInherit | InheritanceFlags.ContainerInherit, PropagationFlags.NoPropagateInherit, AccessControlType.Allow));
            File.SetAccessControl(fileName, fSecurityInfo);
        }
    }
}
