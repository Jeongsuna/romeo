using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web;

namespace Romeo._0029_CWE488_Exposure_of_Data_Element_to_Wrong_Session
{
    // 출처: 소프트웨어 개발보안 가이드(2017.01) 수정
    class CWE488_Exposure_of_Data_Element_to_Wrong_Session__simple_01 : IHttpHandler
    {
        public bool IsReusable => false;

        public void ProcessRequest(HttpContext context)
        {
            Bad(context);
            Good(context);
        }
        private String id;
        public void Bad(HttpContext ctx)
        {
            id = ctx.Request.QueryString["id"];
            ctx.Response.ContentType = "application / json";
            ctx.Response.Write(id);
        }

        public void Good(HttpContext ctx)
        {
            ctx.Session["id"] = ctx.Request.QueryString["id"];
            ctx.Response.ContentType = "application / html";
            ctx.Response.Write(ctx.Session["id"]);
        }
    }
}
