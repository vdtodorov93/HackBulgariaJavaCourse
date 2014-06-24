package com.hackbulgaria.filespractice;

public class WordCountResult {
    private int lineCount;
    private int wordCount;
    private int characterCount;

    public WordCountResult(int lc, int wc, int cc) {
        this.lineCount = lc;
        this.wordCount = wc;
        this.characterCount = cc;
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }

}
