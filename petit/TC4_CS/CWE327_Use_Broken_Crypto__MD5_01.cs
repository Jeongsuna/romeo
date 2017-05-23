using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Security.Cryptography;

namespace Romeo.CWE327_Use_Broken_Crypto
{
    class CWE327_Use_Broken_Crypto__MD5_01
    {
        public void bad(string msg)
        {
            string tainted_0 = null;
            string tainted_1 = null;

            tainted_0 = msg;
            tainted_1 = tainted_0;

            //No filtering (sanitization)
            tainted_1 = tainted_0;

            //flaw
            using (MD5 md5Hash = MD5.Create())
            {
                byte[] data = md5Hash.ComputeHash(Encoding.UTF8.GetBytes(tainted_1));

                // Create a new Stringbuilder to collect the bytes
                // and create a string.
                StringBuilder sBuilder = new StringBuilder();

                // Loop through each byte of the hashed data
                // and format each one as a hexadecimal string.
                for (int i = 0; i < data.Length; i++)
                {
                    sBuilder.Append(data[i].ToString("x2"));
                }

                string encrypted = sBuilder.ToString();
            }
        }

        public void good(string msg, string key)
        {
            string tainted_0 = null;
            string tainted_1 = null;

            tainted_0 = msg;
            tainted_1 = tainted_0;

            //No filtering (sanitization)
            tainted_1 = tainted_0;


            byte[] keyArray = UTF8Encoding.UTF8.GetBytes(key);
            byte[] toEncryptArray = UTF8Encoding.UTF8.GetBytes(msg);
            //FIX
            RijndaelManaged rDel = new RijndaelManaged();
            rDel.Key = keyArray;
            rDel.Mode = CipherMode.ECB;
            rDel.Padding = PaddingMode.PKCS7;
            ICryptoTransform cTransform = rDel.CreateEncryptor();
            byte[] resultArray = cTransform.TransformFinalBlock(toEncryptArray, 0, toEncryptArray.Length);
            string encrypt =  Convert.ToBase64String(resultArray, 0, resultArray.Length);
        }
    }
}
