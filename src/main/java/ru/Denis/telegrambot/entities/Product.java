package ru.Denis.telegrambot.entities;

import javax.persistence.*;

@Entity
public class Product
{
    @Id
    @GeneratedValue
    private Long id; // Уникальный идентификатор

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category", nullable = false)
    private Category category; // Категория товара

    @Column(name = "name", nullable = false, unique = true)
    private String name; // Название

    @Column(name = "description", nullable = false)
    private String description; // Описание

    @Column(name = "price", nullable = false)
    private Double price; // Стоимость

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
