package com.commandline.main;

public class Word implements Comparable<Word> {
    private String word_target;
    private String word_explain;

    public Word(String word) {
        word_target = word;
    }

    @Override
    public int compareTo(Word o) {
        return this.word_target.compareTo(o.word_target);
    }

    public Word(String word_target, String word_explain) {
        this.word_explain = word_explain;
        this.word_target = word_target;
    }

    public String getWord_target() {
        return word_target;
    }
    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }
    public String getWord_explain() {
        return word_explain;
    }
    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
}
