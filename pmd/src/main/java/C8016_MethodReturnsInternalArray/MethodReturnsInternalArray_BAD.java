package C8016_MethodReturnsInternalArray;

public class MethodReturnsInternalArray_BAD {
    public class Foo {
        UserData [] userd;
        public UserData [] getUserData() {
            return userd;
        }

        private class UserData {
        }
    }
}
