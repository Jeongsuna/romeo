using System;
using System.Web;

namespace Romeo.CWE80_XSS
{
    public class CWE80_XSS__Simple_02 : IHttpHandler
    {
        /// <summary>
        /// 이 처리기를 사용하려면 먼저 웹의 Web.config 파일에서 처리기를 
        /// 구성하고 IIS에 등록해야 합니다.
        /// 자세한 내용은 http://go.microsoft.com/?linkid=8101007 링크를 참조하십시오.
        /// </summary>
        #region IHttpHandler Members

        public bool IsReusable
        {
            // 관리되는 처리기를 다른 요청에서 다시 사용할 수 없는 경우 false를 반환합니다.
            // 일반적으로 요청마다 유지되는 상태 정보가 있을 경우 false가 됩니다.
            get { return true; }
        }

        public void ProcessRequest(HttpContext context)
        {
            //여기에 처리기 구현을 씁니다.
        }

        #endregion
    }
}
