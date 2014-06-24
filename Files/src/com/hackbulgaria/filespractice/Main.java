package com.hackbulgaria.filespractice;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        File sub = new File("/home/vasil/Programming/HackBG/JavaCourse/Files/lost.srt");
        FileUtils.fixEncoding(sub.toPath());
    }

}
