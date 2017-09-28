using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE350_Reliance_on_Reverse_DNS_Resolution_for_a_Security_Critical_Action
{
    class CWE350_Reliance_on_Reverse_DNS_Resolution_for_a_Security_Critical_Action__Simple_01
    {
        public bool bad(string RemoteIpAddress)
        {
            bool trusted = false;
            IPAddress hostIPAddress = IPAddress.Parse(RemoteIpAddress);
            IPHostEntry hostInfo = Dns.GetHostEntry(hostIPAddress);
            if (hostInfo.HostName.EndsWith("trustme.com"))
            {
                trusted = true;
            }
            return trusted;
        }

        public bool good(string RemoteIpAddress)
        {
            bool trusted = false;
            string trustedIPAddress = "127.0.0.1";
            IPAddress hostIPAddress = IPAddress.Parse(RemoteIpAddress);

            if (trustedIPAddress.Equals(hostIPAddress.ToString()))
            {
                trusted = true;
            }
            return trusted;
        }

    }
}
