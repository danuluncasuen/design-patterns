package org.utm.dp.entity;

import org.utm.dp.utils.AbstractBuilder;
import org.utm.dp.utils.RiddleAbstractFactory;

import java.util.List;

public class MultiChoiceRiddle extends Riddle {

    private List<MultiChoiceAnswer> choices;

    public MultiChoiceRiddle(MultiChoiceRiddleBuilder multiChoiceRiddleBuilder, RiddleAbstractFactory abstractFactory) {
        if (abstractFactory != null) {
            this.id = multiChoiceRiddleBuilder.getId();
            this.description = multiChoiceRiddleBuilder.getDescription();
            this.order = multiChoiceRiddleBuilder.getOrder();
            this.choices = multiChoiceRiddleBuilder.getChoices();
        }
    }

    public static class MultiChoiceRiddleBuilder extends AbstractBuilder {
        private Long id;
        private String description;
        private Integer order;
        private List<MultiChoiceAnswer> choices;

        public Long getId() {
            return id;
        }

        public MultiChoiceRiddleBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public String getDescription() {
            return description;
        }

        public MultiChoiceRiddleBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Integer getOrder() {
            return order;
        }

        public MultiChoiceRiddleBuilder setOrder(Integer order) {
            this.order = order;
            return this;
        }

        public List<MultiChoiceAnswer> getChoices() {
            return choices;
        }

        public MultiChoiceRiddleBuilder setChoices(List<MultiChoiceAnswer> choices) {
            this.choices = choices;
            return this;
        }
    }

}
