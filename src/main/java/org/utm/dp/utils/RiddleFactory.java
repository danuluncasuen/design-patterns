package org.utm.dp.utils;

import org.utm.dp.entity.MultiChoiceRiddle;
import org.utm.dp.entity.Riddle;
import org.utm.dp.entity.TextRiddle;

public class RiddleFactory implements RiddleAbstractFactory {
    @Override
    public Riddle getRiddle(String riddleName, AbstractBuilder builder) {
        switch (riddleName.toLowerCase()) {
            case "text":
                return new TextRiddle((TextRiddle.TextRiddleBuilder) builder, this);
            case "multi":
                return new MultiChoiceRiddle((MultiChoiceRiddle.MultiChoiceRiddleBuilder) builder, this);
        }
        return null;
    }
}
