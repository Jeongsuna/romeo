package C80FC_AvoidFileStream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AvoidFileStream_Good {
    public void foo(String fileName) {

        // the following instantiations help prevent Garbage Collection pauses, no finalization

        try(InputStream is = Files.newInputStream(Paths.get(fileName))) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(OutputStream os = Files.newOutputStream(Paths.get(fileName))) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(BufferedReader br = Files.newBufferedReader(Paths.get(fileName), StandardCharsets.UTF_8)) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(BufferedWriter wr = Files.newBufferedWriter(Paths.get(fileName), StandardCharsets.UTF_8)) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
