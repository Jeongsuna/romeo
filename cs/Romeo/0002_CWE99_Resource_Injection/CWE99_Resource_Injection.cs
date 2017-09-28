using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Sockets;
using System.Text;
using System.Threading.Tasks;
using System.Web.UI;

namespace Romeo._0002_CWE99_Resource_Injection
{
    // 출처: 소프트웨어 개발보안 가이드(2017.01)
    class CWE99_Resource_Injection : Page
    {
        public void Bad(long address)
        {
            int port = Int32.Parse(Request["rPort"]);
            IPEndPoint endpoint = new IPEndPoint(address, port);
            Socket socket = new Socket(endpoint.AddressFamily,
            SocketType.Stream, ProtocolType.Tcp);
            socket.Connect(endpoint);
        }
        public void Good(long address)
        {
            int port = Int32.Parse(Request["rPort"]);
            int newPort = 3000;
            switch (port)
            {
                case 3001:
                    newPort = 3002; break;
                case 3002:
                    newPort = 3002; break;
                case 3003:
                    newPort = 3003; break;
                default:
                    newPort = 3000; break;
            }
            port = newPort;
            IPEndPoint endpoint = new IPEndPoint(address, port);
            Socket socket = new Socket(endpoint.AddressFamily,
            SocketType.Stream, ProtocolType.Tcp);
            socket.Connect(endpoint);
        }
    }
}
