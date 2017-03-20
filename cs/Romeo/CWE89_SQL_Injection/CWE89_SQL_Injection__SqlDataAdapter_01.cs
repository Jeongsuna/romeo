using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Runtime.Remoting.Contexts;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE89_SQL_Injection
{
    class CWE89_SQL_Injection__SqlDataAdapter_01
    {
        public void bad(Context ctx)
        {
            /*
            SqlConnection connection;
            ctx.GetProperty;
            string userName = connection.getAuthenticatedUserName();
            string query = "SELECT * FROM items WHERE owner = '" + userName + "' AND item = '" + ItemName.Text + "'";
            sda = new SqlDataAdapter(query, conn);
            DataTable datatable = new DataTable();
            sda.Fill(datatable);
            */
        }
        public void good()
        {

        }
    }
}
