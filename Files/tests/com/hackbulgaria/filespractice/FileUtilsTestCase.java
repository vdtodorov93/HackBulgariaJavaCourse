package com.hackbulgaria.filespractice;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileUtilsTestCase {
    File file;
    String content;
    File writeFile;
    File properties;
    File wc;

    @Before
    public void setUp() throws Exception {
        file = new File("/home/vasil/Programming/HackBG/JavaCourse/Files/a.txt");
        content = "iiias\nahaha\nmada\n";
        writeFile = new File("/home/vasil/Programming/HackBG/JavaCourse/Files/b.txt");
        properties = new File("/home/vasil/Programming/HackBG/JavaCourse/Files/prop.txt");
        wc = new File("/home/vasil/Programming/HackBG/JavaCourse/Files/wc.txt");
        StringBuilder sb = new StringBuilder();
        sb.append("kilata maika");
        sb.append(System.lineSeparator());
        sb.append("what the fuck");
        sb.append(System.lineSeparator());
        FileUtils.writeTo(wc, sb.toString());
    }

    @Test
    public void testReadFile() throws IOException {
        assertEquals(content, FileUtils.readFrom(file));
    }

    @Test
    public void testReadFileWithPath() throws IOException {
        assertEquals(content, FileUtils.readFrom(file.toPath()));
    }

    @Test
    public void testWriteFile() throws IOException {
        FileUtils.writeTo(writeFile, "MEH");
        assertEquals("MEH\n", FileUtils.readFrom(writeFile));
    }

    @Test
    public void testWriteFileWithPath() throws IOException {
        FileUtils.writeTo(writeFile.toPath(), "WTF");
        assertEquals("WTF\n", FileUtils.readFrom(writeFile.toPath()));
    }

    @Test
    public void testParseProperties() throws IOException {
        Map<String, String> result = FileUtils.parseProperties(properties);
        assertEquals("b1", result.get("a1"));
        assertEquals("b6=b7=b8", result.get("a5"));
        assertEquals("=b10", result.get("a7"));
        assertEquals("b9", result.get("a6"));
    }

    @Test
    public void testWC() throws IOException {
        WordCountResult result = FileUtils.wordCount(wc.toPath());
        assertEquals(25, result.getCharacterCount());
        assertEquals(5, result.getWordCount());
        assertEquals(2, result.getLineCount());
    }

    @After
    public void tearDown() throws Exception {
        try{
            Files.delete(writeFile.toPath());
            Files.delete(wc.toPath());
        }
        catch (Exception ex){
        }
    }

}
