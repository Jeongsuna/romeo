using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE497_Exposure_of_System_Data_to_Unauthorized_Control_Sphere
{
    class CWE497_Exposure_of_System_Data_to_Unauthorized_Control_Sphere__Sqlconnection_Writeline_01
    {
        void bad()
        {
            string cs = "database=northwind; server=mySQLServer...";
            SqlConnection conn = new SqlConnection(cs);
            conn.Open();
            // Flaw: connection information exposure
            Console.WriteLine(cs);
        }

        void good()
        {
            string cs = "database=northwind; server=mySQLServer...";
            SqlConnection conn = new SqlConnection(cs);
            conn.Open();
        }
    }
}
