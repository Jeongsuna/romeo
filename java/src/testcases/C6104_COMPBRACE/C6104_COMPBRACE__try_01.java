package testcases.C6104_COMPBRACE;

import java.io.IOException;

public class C6104_COMPBRACE__try_01 {
    private void log(Exception e) {

    }
    public void bad(String[] args) {
        try {
            throw new IOException();
          } catch (IOException e) { /* Non-compliant - Indentation */
            log(e);
        }

    }

    public void good(String[] args) {
        try {
            throw new IOException();
        } catch (IOException e) { /* Compliant - Indentation */
            log(e);
        }
    }
}

