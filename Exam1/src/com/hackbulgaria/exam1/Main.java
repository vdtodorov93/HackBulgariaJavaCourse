package com.hackbulgaria.exam1;

public class Main {
    public static void main(String[] args) {
        Logger logger = new DateLogger(3);
        logger.log(2, "Somewhat important message"); //gets logged as "2 => Somewhat important message"
        logger.log(3, "Less important message"); // also gets logged!
        logger.log(5, "Not important"); //this is less important than LEVEL, so it will **not be logged**.
        logger.log("Meh"); //overload without a LEVEL parameter, use 3 as default.
        logger.setLevel(2);
        logger.log("My message"); //does not get printed!
    }

}
