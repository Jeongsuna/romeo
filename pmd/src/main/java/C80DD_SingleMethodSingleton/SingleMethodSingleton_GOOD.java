package C80DD_SingleMethodSingleton;

public class SingleMethodSingleton_GOOD {
    public static class Singleton {
        private static Singleton singleton = new Singleton( );
        private Singleton(){ }
        public static Singleton getInstance( ) {
            return singleton;
        }
    }
}
