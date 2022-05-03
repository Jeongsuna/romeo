package CF013_CRITICALVAR__CWE493;

public class CRITICALVAR_GOOD {
    public final class Data extends Phone {
        public float price;
        //...
        public final void Data() {
            this.price = LookupPrice("MyDataType");
        }

        private float LookupPrice(String myDataType) {
            return 0;
        }
    }

    private class Phone {
    }
}
