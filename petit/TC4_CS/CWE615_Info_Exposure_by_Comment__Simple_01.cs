using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace Romeo.CWE615_Info_Exposure_by_Comment
{
    class CWE615_Info_Exposure_by_Comment__Simple_01
    {
        // FLAW: administrator's password is "tiger."
        public void bad(string connectionString, string userName, string password)
        {
            if (!Regex.IsMatch(userName, @"^[a-zA-Z'./s]{1,40}$")) {
                Console.WriteLine("Invalid name format");
                return;
			}

            if (!Regex.IsMatch(password,
                     @"^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,10}$")) {
                Console.WriteLine("Invalid password format");
				return;
			}

            using (SqlConnection connection = new SqlConnection(connectionString))
            {
                DataTable datatable = new DataTable();
                string query = "SELECT * FROM items WHERE owner = '" + userName + "' AND password = '" + password + "'";
                var sda = new SqlDataAdapter(query, connection);

                sda.Fill(datatable);
            }
        }
    }
}
