package C9036_USEREADRETURN;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class USEREADRETURN_Good {
    public void doSomethingWithFile(String fileName) {
        BufferedReader buffRead = null;
        try {
            buffRead = new BufferedReader(new FileReader(fileName));
            String line = null;
            while ((line = buffRead.readLine()) != null) {
                // ...
            }
        } catch (IOException e) {
            // ...
        }
    }
}
