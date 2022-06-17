package C8096_AvoidDecimalLiteralsInBigDe;

import java.math.BigDecimal;

public class AvoidDecimalLiteralsInBigDecimalConstructor_GOOD {
    BigDecimal bd = new BigDecimal("1.123");
    BigDecimal bd2 = new BigDecimal(12);
}
