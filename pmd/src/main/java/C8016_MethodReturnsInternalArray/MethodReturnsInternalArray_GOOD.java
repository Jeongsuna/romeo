package C8016_MethodReturnsInternalArray;

public class MethodReturnsInternalArray_GOOD {
    public class Foo {
        UserData[] userd;

        public UserData[] getUserData() {
            UserData[] copy;
            copy = userd;
            return copy;
        }
        private class UserData {
        }
    }
}
