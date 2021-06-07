package org.utm.dp.entity;

import org.utm.dp.utils.AbstractBuilder;
import org.utm.dp.utils.RiddleAbstractFactory;

public class TextRiddle extends Riddle {

    private String correctAnswer;

    public TextRiddle(TextRiddleBuilder textRiddleBuilder, RiddleAbstractFactory abstractFactory) {
        if (abstractFactory != null) {
            this.id = textRiddleBuilder.getId();
            this.correctAnswer = textRiddleBuilder.getCorrectAnswer();
            this.description = textRiddleBuilder.getDescription();
            this.order = textRiddleBuilder.getOrder();
        }
    }

    public static class TextRiddleBuilder extends AbstractBuilder {
        private String correctAnswer;
        private Long id;
        private Integer order;
        private String description;

        public String getCorrectAnswer() {
            return correctAnswer;
        }

        public TextRiddleBuilder setCorrectAnswer(String correctAnswer) {
            this.correctAnswer = correctAnswer;
            return this;
        }

        public Long getId() {
            return id;
        }

        public TextRiddleBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public Integer getOrder() {
            return order;
        }

        public TextRiddleBuilder setOrder(Integer order) {
            this.order = order;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public TextRiddleBuilder setDescription(String description) {
            this.description = description;
            return this;
        }
    }

}
