package C80FF_BigIntegerInstantiation;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerInstantiation_Bad {
    public void foo() {

        BigInteger bi1 = new BigInteger("1");       // reference BigInteger.ONE instead
        BigInteger bi2 = new BigInteger("0");    // reference BigInteger.ZERO instead
        BigInteger bi3;
        bi3 = new BigInteger("10");             // reference BigInteger.TEN instead


        BigDecimal bd1 = new BigDecimal("1");       // reference BigDecimal.ONE instead
        BigDecimal bd2 = new BigDecimal("0");    // reference BigDecimal.ZERO instead
        BigDecimal bd3;
        bd3 = new BigDecimal("10");             // reference BigDecimal.TEN instead

    }
}
