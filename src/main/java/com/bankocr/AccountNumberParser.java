package com.bankocr;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class AccountNumberParser {

    public Stream<String> readFileLines(String filename) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL fileUrl = classLoader.getResource(filename);
        assert fileUrl != null;
        return Files.lines(Paths.get(fileUrl.getFile()));
    }
}
