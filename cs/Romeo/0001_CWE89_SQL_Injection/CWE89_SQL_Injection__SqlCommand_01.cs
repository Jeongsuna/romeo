using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web.UI;

namespace Romeo._0001_CWE89_SQL_Injection
{
    // 출처: 소프트웨어 개발보안 가이드(2017.01)
    class CWE89_SQL_Injection__SqlCommand_01 : Page
    {
        public void Bad(object sender, EventArgs e)
        {
            string connect = "MyConnString";
            string userid = Request["userid"];
            string query = "SELECT* FROM user WHERE id = '" + userid + "'";
            using (var conn = new SqlConnection(connect))
            {
                using (var cmd = new SqlCommand(query, conn))
                {
                    conn.Open();
                    // FLAW
                    cmd.ExecuteReader();
                }
            }
        }
        public void Good(object sender, EventArgs e)
        {
            string connect = "MyConnString";
            string userid = Request["userid"];
            string query = "SELECT* FROM user WHERE id = @userid";
            using (var conn = new SqlConnection(connect))
            {
                using (var cmd = new SqlCommand(query, conn))
                {
                    cmd.Parameters.Add("@userid", SqlDbType.VarChar, 10);
                    cmd.Parameters["@userid"].Value = userid;
                    conn.Open();
                    cmd.ExecuteReader();
                }
            }
        }
    }
}
