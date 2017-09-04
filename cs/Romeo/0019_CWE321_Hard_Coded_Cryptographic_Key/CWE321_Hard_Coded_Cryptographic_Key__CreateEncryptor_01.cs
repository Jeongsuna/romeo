using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace Romeo._0019_CWE321_Hard_Coded_Cryptographic_Key
{
    // 출처: 소프트웨어 개발보안 가이드(2017.01)
    class CWE321_Hard_Coded_Cryptographic_Key__CreateEncryptor_01
    {
        static void Bad(string cryptFile, string inputFile)
        {
            UnicodeEncoding UE = new UnicodeEncoding();
            byte[] salt = UE.GetBytes("Xjafe231x42X423XadXCadfkhjeAdS");
            byte[] IV = UE.GetBytes("83Xkda7l78Dkx85KdJazppoqq6SaxDs");
            byte[] key = UE.GetBytes("341235XadfaDADFexA8932F7Dz3J3X");
            using (FileStream fsCrypt = new FileStream(cryptFile, FileMode.Create))
            {
                using (RijndaelManaged RMCrypto = new RijndaelManaged())
                {
                    // FLAW:
                    using (CryptoStream cs = new CryptoStream(fsCrypt, RMCrypto.CreateEncryptor(key, IV), CryptoStreamMode.Write))
                    {
                        using (FileStream fsIn = new FileStream(inputFile, FileMode.Open))
                        {
                            // FLAW:
                            fsCrypt.Write(salt, 0, salt.Length);
                            fsCrypt.Write(IV, 0, IV.Length);
                            fsIn.CopyTo(cs);
                        }
                    }
                }
            }
        }

        static void Good(string password, string cryptFile, string inputFile)
        {
            byte[] salt = new byte[32];
            RandomNumberGenerator rand = new RNGCryptoServiceProvider();
            rand.GetBytes(salt);
            byte[] IV = new byte[16];
            rand.GetBytes(IV);
            byte[] key = new Rfc2898DeriveBytes(password, salt).GetBytes(32);
            using (FileStream fsCrypt = new FileStream(cryptFile, FileMode.Create))
            {
                using (RijndaelManaged RMCrypto = new RijndaelManaged())
                {
                    using (CryptoStream cs = new CryptoStream(fsCrypt, RMCrypto.CreateEncryptor(key, IV), CryptoStreamMode.Write))
                    {
                        using (FileStream fsIn = new FileStream(inputFile, FileMode.Open))
                        {
                            fsCrypt.Write(salt, 0, salt.Length);
                            fsCrypt.Write(IV, 0, IV.Length);
                            fsIn.CopyTo(cs);
                        }
                    }
                }
            }
        }
    }
}
