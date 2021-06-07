package org.utm.dp.utils;

import org.utm.dp.entity.Riddle;

public interface RiddleAbstractFactory {
    Riddle getRiddle(String riddleName, AbstractBuilder builder);
}
