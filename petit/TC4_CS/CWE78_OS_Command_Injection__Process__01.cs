using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE78_OS_Command_Injection
{
    class CWE78_OS_Command_Injection__Process__01
    {
        void bad(string ident)
        {
            ProcessStartInfo proStartInfo = new ProcessStartInfo("Program.exe");
            proStartInfo.UseShellExecute = true;
            proStartInfo.Arguments = ident;
            Process.Start(proStartInfo);
        }

        void good()
        {
            string filename = "network.config";
            ProcessStartInfo proStartInfo = new ProcessStartInfo("Program.exe");
            proStartInfo.UseShellExecute = true;
            proStartInfo.Arguments = filename;
            Process.Start(proStartInfo);
        }
    }
}
