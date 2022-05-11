package C9019_IMPOSSERIALIZE;

public class IMPOSSERIALIZE_BAD {
    class Fruit{
        private transient Season ripe;

        private class Season {
        }
        // ...
    }
}
