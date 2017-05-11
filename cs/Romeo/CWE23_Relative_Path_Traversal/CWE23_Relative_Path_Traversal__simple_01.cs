using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web;

namespace Romeo.CWE23_Relative_Path_Traversal
{
    class CWE23_Relative_Path_Traversal__simple_01_good : IHttpHandler
    {
        public bool IsReusable
        {
            get
            {
                throw new NotImplementedException();
            }
        }

        public void ProcessRequest(HttpContext ctx)
        {
            String path = ctx.Request.QueryString["path"];
            
            // Flaw: This could still read any file on the filesystem.
            ctx.Response.Write(File.ReadAllText("/home/user/" + path));
        }

    }

    class CWE23_Relative_Path_Traversal__simple_01_bad : IHttpHandler
    {
        public bool IsReusable
        {
            get
            {
                throw new NotImplementedException();
            }
        }

        public void ProcessRequest(HttpContext ctx)
        {
            // FIX: This could still read any file on the filesystem.
            String path = "report.doc";

            ctx.Response.Write(File.ReadAllText("/home/user/" + path));
        }
    }
}
