package com.hackbulgaria.filespractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileUtils {
    private FileUtils() {
    }

    public static String readFrom(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        Path path = file.toPath();
        List<String> content = Files.readAllLines(path, Charset.defaultCharset());
        for (String line : content) {
            sb.append(line);
            // sb.append('\n');
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static String readFrom(Path path) throws IOException {
        return readFrom(path.toFile());
    }

    public static void writeTo(File file, String content) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        }
    }

    public static void writeTo(Path path, String content) throws IOException {
        writeTo(path.toFile(), content);
    }

    public static Map<String, String> parseProperties(File file) throws IOException {
        Map<String, String> properties = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            for (String line; (line = br.readLine()) != null;) {
                if (line.charAt(0) != '#') {
                    int equalIndex = line.indexOf('=');
                    if (equalIndex == -1) {
                        throw new IOException("Invalid key-value pair in .properties file");
                    }
                    String key = line.substring(0, equalIndex);
                    int indexOfComment = line.indexOf('#');
                    String value;
                    if (indexOfComment != -1) {
                        value = line.substring(equalIndex + 1, line.indexOf('#'));
                    } else {
                        value = line.substring(equalIndex + 1);
                    }
                    key = key.trim();
                    value = value.trim();
                    properties.put(key, value);
                }
            }
        }

        return properties;
    }

    private static int CountWords(String in) {
        String trim = in.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split("\\s+").length; // separate string around spaces
    }

    public static WordCountResult wordCount(Path path) throws IOException {
        int lines = 0;
        int chars = 0;
        int words = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()));) {
            for (String line; (line = reader.readLine()) != null;) {
                lines++;
                chars += line.length();
                words += CountWords(line);
            }
        }

        return new WordCountResult(lines, words, chars);
    }

    public static byte[] convertEncoding(byte[] bytes, String from, String to) throws UnsupportedEncodingException {
        return new String(bytes, from).getBytes(to);
    }

    public static void fixEncoding(Path path) throws IOException {
        byte[] data = Files.readAllBytes(path);
        byte[] result = convertEncoding(data, "windows-1251", "UTF-8");
        Files.write(path, result);
    }

}
