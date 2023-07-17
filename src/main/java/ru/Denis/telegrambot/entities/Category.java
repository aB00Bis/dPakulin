package ru.Denis.telegrambot.entities;

import javax.persistence.*;

@Entity
public class Category
{
    @Id
    @GeneratedValue
    private Long id; // Уникальный идентификатор

    @Column(name = "name", nullable = false, unique = true)
    private String name; // Название категории

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent")
    private Category parent; // Родительская категория

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }
}
