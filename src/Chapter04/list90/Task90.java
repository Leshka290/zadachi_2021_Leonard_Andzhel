package Chapter04.list90;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
LVTI и потоки. Написать несколько фрагментов кода, которые иллюстрируют
использование LVTI и потоков Java.
 */
public class Task90 {

    public static void varAndStream() throws IOException {

        var paths = Stream.of(1, 2, 3);
        var pathStream = Files.lines(Path.of(" "));
        var fileList = pathStream.map(p -> new File(p)).collect(Collectors.toList());
    }
}
