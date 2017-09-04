using System;
using System.Configuration;
using System.Data.SqlClient;

namespace Romeo.CWE259_Hard_Coded_Password
{
    // 출처: 소프트웨어 개발보안 가이드(2017.01)
    class CWE259_Hard_Coded_Password__SqlConnection_01
    {
        static void Bad()
        {
            // FLAW: source
            string connectionString = "Data Source = 192.168.1.200,1433; Initial Catalog = gov; User ID = admin; Password = 1111;";
            string queryString = "SELECT Id, ProductName FROM dbo.Products;";
            // FLAW: sink
            using (SqlConnection connection = new SqlConnection(connectionString))
            {
                SqlCommand command = new SqlCommand(queryString, connection);
                connection.Open();
                using (var reader = command.ExecuteReader())
                {
                    while (reader.Read())
                    {
                        Console.WriteLine(String.Format("{ 0}, { 1}", reader[0], reader[1]));
                    }
                }
            }
        }
        static void Good()
        {
            var connectionString = ConfigurationManager.ConnectionStrings["WingtipToys"].ConnectionString;
            string queryString = "SELECT Id, ProductName FROM dbo.Products;";
            using (var connection = new SqlConnection(connectionString))
            {
                var command = new SqlCommand(queryString, connection);
                connection.Open();
                using (var reader = command.ExecuteReader())
                {
                    while (reader.Read())
                    {
                        Console.WriteLine(String.Format("{ 0}, { 1}", reader[0], reader[1]));
                    }
                }
            }
        }
    }
}
