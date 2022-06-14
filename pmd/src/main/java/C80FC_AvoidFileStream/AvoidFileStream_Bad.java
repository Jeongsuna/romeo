package C80FC_AvoidFileStream;

import java.io.*;

public class AvoidFileStream_Bad {
    public void foo(String fileName) {

        // these instantiations cause garbage collection pauses, even if properly closed

        try {
            FileInputStream fis = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            FileOutputStream fos = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fr = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter fw = new FileWriter(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
