package org.utm.dp.entity.decorations;

import org.utm.dp.entity.Riddle;

public class HintDecorator implements RiddleDecorator {
    private Riddle riddle;
    private String hint;

    public HintDecorator(Riddle riddle, String hint) {
        this.riddle = riddle;
        this.hint = hint;
    }

    @Override
    public void decorateRiddle() {
        riddle.setDescription(riddle.getDescription().concat("\nHINT: " + hint));
    }
}
