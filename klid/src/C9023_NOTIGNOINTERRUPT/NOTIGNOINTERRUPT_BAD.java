package C9023_NOTIGNOINTERRUPT;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NOTIGNOINTERRUPT_BAD extends Thread {

    Logger LOGGER = Logger.getLogger(NOTIGNOINTERRUPT_BAD.class.getName());

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) { // Noncompliant; logging is not enough
            LOGGER.log(Level.WARNING, "Interrupted!", e);
        }
    }

}
