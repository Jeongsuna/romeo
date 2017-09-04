using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE327_Use_Broken_Crypto
{
    class CWE327_Use_Broken_Crypto__SHA1_01
    {
        static byte[] Bad(byte[] data)
        {
            byte[] result;
            // Flaw
            SHA1 sha = new SHA1CryptoServiceProvider();
            result = sha.ComputeHash(data);
            return result;
        }
        static byte[] Good(byte[] data)
        {
            byte[] result;
            SHA256 sha = new SHA256CryptoServiceProvider();
            result = sha.ComputeHash(data);
            return result;
        }
    }
}
