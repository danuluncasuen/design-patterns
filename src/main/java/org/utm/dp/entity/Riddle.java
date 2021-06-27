package org.utm.dp.entity;

public abstract class Riddle {

    protected Long id;
    protected Integer order;
    protected String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
