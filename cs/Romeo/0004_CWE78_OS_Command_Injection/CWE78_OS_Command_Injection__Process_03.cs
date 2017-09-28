using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Romeo._0004_CWE78_OS_Command_Injection
{
    class CWE78_OS_Command_Injection__Process_03 : Page
    {
        TextBox PgmTextBox;
        public void Bad()
        {
            String command = Request["command"];
            Process myProcess = new Process();
            try
            {
                myProcess.StartInfo.UseShellExecute = false;
                myProcess.StartInfo.FileName = command;
                myProcess.StartInfo.CreateNoWindow = true;
                myProcess.Start();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }
        public void Good()
        {
            String command = Request["command"];
            Process myProcess = new Process();
            try
            {
                string[] allowList = { "find", "grep" };
                if (allowList.Contains(command))
                {
                    myProcess.StartInfo.UseShellExecute = false;
                    myProcess.StartInfo.FileName = command;
                    myProcess.StartInfo.CreateNoWindow = true;
                    myProcess.Start();
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}
