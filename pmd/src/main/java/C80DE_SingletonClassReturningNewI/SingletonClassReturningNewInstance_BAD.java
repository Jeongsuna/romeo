package C80DE_SingletonClassReturningNewI;

public class SingletonClassReturningNewInstance_BAD {
    static class Singleton {
        private static Singleton instance = null;
        public static Singleton getInstance() {
            synchronized(Singleton.class) {
                return new Singleton();
            }
        }
    }
}
