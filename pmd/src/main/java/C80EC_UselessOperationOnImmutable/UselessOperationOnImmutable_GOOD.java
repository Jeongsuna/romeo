package C80EC_UselessOperationOnImmutable;

import java.math.BigDecimal;

public class UselessOperationOnImmutable_GOOD {
    class Test {
        void method2() {
            BigDecimal bd=new BigDecimal(10);
            bd = bd.add(new BigDecimal(5));
        }
    }
}
