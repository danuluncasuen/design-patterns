package org.utm.dp.entity;

public class User {

    private Long id;
    private String username;
    private Integer riddleOrder;

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public User setRiddleOrder(Integer riddleOrder) {
        this.riddleOrder = riddleOrder;
        return this;
    }

    public Long getId() {
        return id;
    }
}
