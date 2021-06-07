package org.utm.dp.entity;

public class MultiChoiceAnswer {

    private String choice;
    private boolean correct;

    public MultiChoiceAnswer(String choice, boolean correct) {
        this.choice = choice;
        this.correct = correct;
    }
}
