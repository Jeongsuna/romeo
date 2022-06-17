package C8087_UseObjectForClearerAPI;

public class UseObjectForClearerAPI_GOOD {
    public class MyClass {
        public void connect(UserData data) {
        }
    }

    private class UserData {
        String username;
        String pssd;
        String databaseName;
        String databaseAdress;
    }
}

