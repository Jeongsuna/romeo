package C8062_AvoidCatchingGenericExcepti;

public class AvoidCatchingGenericException_BAD {
    public class PrimitiveType {
        public void downCastPrimitiveType() {
            int i = 5;
            try {
                System.out.println(" i [" + i + "]");
            } catch(NullPointerException e) {
                e.printStackTrace();
            } catch(RuntimeException e) {
                e.printStackTrace();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
