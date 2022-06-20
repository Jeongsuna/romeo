package C80EC_UselessOperationOnImmutable;
import java.math.*;
public class UselessOperationOnImmutable_BAD {
    class Test {
        void method1() {
            BigDecimal bd=new BigDecimal(10);
            bd.add(new BigDecimal(5));
        }
    }
}
