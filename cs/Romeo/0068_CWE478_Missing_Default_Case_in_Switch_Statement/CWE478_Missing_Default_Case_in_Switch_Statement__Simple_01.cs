using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Romeo.CWE478_Missing_Default_Case_in_Switch_Statement
{
    class CWE478_Missing_Default_Case_in_Switch_Statement__Simple_01
    {
        public const string INTEREST_RATE_AT_ZERO_POINTS = "5.00";
        public const string INTEREST_RATE_AT_ONE_POINTS = "4.75";
        public const string INTEREST_RATE_AT_TWO_POINTS = "4.50";

        BigDecimal bad(int points)
        {
            BigDecimal result = new BigDecimal(INTEREST_RATE_AT_ZERO_POINTS);

            switch (points)
            {
                case 0:
                    result = new BigDecimal(INTEREST_RATE_AT_ZERO_POINTS);
                    break;
                case 1:
                    result = new BigDecimal(INTEREST_RATE_AT_ONE_POINTS);
                    break;
                case 2:
                    result = new BigDecimal(INTEREST_RATE_AT_TWO_POINTS);
                    break;
            }
            return result;
        }

        BigDecimal good(int points)
        {
            BigDecimal result = new BigDecimal(INTEREST_RATE_AT_ZERO_POINTS);

            switch (points)
            {
                case 0:
                    result = new BigDecimal(INTEREST_RATE_AT_ZERO_POINTS);
                    break;
                case 1:
                    result = new BigDecimal(INTEREST_RATE_AT_ONE_POINTS);
                    break;
                case 2:
                    result = new BigDecimal(INTEREST_RATE_AT_TWO_POINTS);
                    break;
                default:
                    Console.WriteLine("Invalid value for points, must be 0, 1 or 2");
                    Console.WriteLine("Returning null value for interest rate");
                    result = null;
                    break;
            }
            return result;
        }
    }

    class BigDecimal
    {
        private string literal;

        public BigDecimal(string literal)
        {
            this.literal = literal;
        }
    }
}
