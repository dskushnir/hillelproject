package ua.hillel.dskushnir.lesson14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("E:\\Hillel\\test.text");
        Path destination = Paths.get("E:\\Hillel\\newDirectory");

        List<Path> sources = Files.walk(source).collect(Collectors.toList());
        List<Path> destinations = sources.stream()
                .map(source::relativize)
                .map(destination::resolve)
                .collect(Collectors.toList());

        for (int i = 0; i < sources.size(); i++) {
            Files.copy(sources.get(i), destinations.get(i));
        }

    }
}
