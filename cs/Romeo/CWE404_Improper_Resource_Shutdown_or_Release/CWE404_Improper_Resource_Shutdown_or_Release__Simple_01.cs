using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE404_Improper_Resource_Shutdown_or_Release
{
    class CWE404_Improper_Resource_Shutdown_or_Release__Simple_01
    {
        void bad(string connString, string queryString)
        {
            SqlConnection conn = new SqlConnection(connString);
            SqlCommand cmd = new SqlCommand(queryString);
            cmd.Connection = conn;
            conn.Open();
            SqlDataReader rdr = cmd.ExecuteReader();
            HarvestResults(rdr);
            // FLAW: when conn.Close() is not reached resource leak
            conn.Close();
        }

        void good_using(string connString, string queryString)
        {
            // FIX: 'using' guarantees resource closing
            using (SqlConnection conn = new SqlConnection(connString))
            {
                SqlCommand cmd = new SqlCommand(queryString);
                cmd.Connection = conn;
                conn.Open();
                SqlDataReader rdr = cmd.ExecuteReader();
                HarvestResults(rdr);
            }
        }

        void good_try(string connString, string queryString)
        {
            SqlConnection conn = null;
            try
            {
                conn = new SqlConnection(connString);
                SqlCommand cmd = new SqlCommand(queryString);
                cmd.Connection = conn;
                conn.Open();
                SqlDataReader rdr = cmd.ExecuteReader();
                HarvestResults(rdr);
            }
            catch (Exception e)
            {
                throw;
            }
            finally
            {
                if(conn !=null)
                {
                    // FIX: resource closing at finllay clause
                    conn.Close();
                }
            }
        }

        private void HarvestResults(SqlDataReader rdr)
        {
            throw new NotImplementedException();
        }
    }
}
