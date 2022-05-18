package C9023_NOTIGNOINTERRUPT;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NOTIGNOINTERRUPT_GOOD extends Thread {

    Logger LOGGER = Logger.getLogger(NOTIGNOINTERRUPT_GOOD.class.getName());

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            LOGGER.log(Level.WARNING, "Interrupted!", e);
            // Restore interrupted state...
            Thread.currentThread().interrupt();
        }
    }

}
