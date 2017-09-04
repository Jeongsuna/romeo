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
    // 출처: 소프트웨어 개발보안 가이드(2017.01)
    class CWE78_OS_Command_Injection__Process_02 : Page
    {
        TextBox PgmTextBox;
        public void Bad()
        {
            String version = PgmTextBox.Text;
            String command = "cmd.exe" + version;
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
            string version = PgmTextBox.Text;
            String command = "cmd.exe" +version;
            Process myProcess = new Process();
            try
            {
                string[] versionList = { "1.0", "2.0" };
                if (Array.Find(versionList, x => x != "1.0") == version)
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
