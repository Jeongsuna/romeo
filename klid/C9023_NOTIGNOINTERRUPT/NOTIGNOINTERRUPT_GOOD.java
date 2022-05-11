package C9023_NOTIGNOINTERRUPT;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class NOTIGNOINTERRUPT_GOOD {
    public class Foo{
        Logger LOGGER = Logger.getLogger(Foo.class.getName());

        public void running () {
            try {
                while (true) {
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e) {
                LOGGER.log(Level.WARN, "Interrupted!", e);
                // Restore interrupted state...
                Thread.currentThread().interrupt();
            }
        }
    }

}
