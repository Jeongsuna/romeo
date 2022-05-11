package C9023_NOTIGNOINTERRUPT;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class NOTIGNOINTERRUPT_BAD {
    public class Foo{
        Logger LOGGER = Logger.getLogger(NOTIGNOINTERRUPT_GOOD.Foo.class.getName());

        public void running () {
            try {
                while (true) {
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e) { // Noncompliant; logging is not enough
                LOGGER.log(Level.WARN, "Interrupted!", e);
            }
        }
    }
}
