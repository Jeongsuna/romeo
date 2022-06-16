package C8062_AvoidCatchingGenericExcepti;

import java.io.IOException;

public class AvoidCatchingGenericException_GOOD {
    public class PrimitiveType {
        public void downCastPrimitiveType() throws Exception  {
            int i = 5;
            System.out.println(" i [" + i + "]");
        }
    }
}
