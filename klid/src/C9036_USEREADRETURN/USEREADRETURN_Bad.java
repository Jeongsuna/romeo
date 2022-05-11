package C9036_USEREADRETURN;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class USEREADRETURN_Bad {
    public void doSomethingWithFile(String fileName) {
        BufferedReader buffRead = null;
        try {
            buffRead = new BufferedReader(new FileReader(fileName));
            while (buffRead.readLine() != null) { // Noncompliant
                // ...
            }
        } catch (IOException e) {
            // ...
        }
    }
}
