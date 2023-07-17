package ru.Denis.telegrambot.entities;

import javax.persistence.*;

@Entity
public class OrderProduct
{
    @Id
    @GeneratedValue
    private Long id; // Уникальный идентификатор

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clientOrder", nullable = false)
    private ClientOrder clientOrder; // Заказ клиента

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product", nullable = false)
    private Product product; // Товар в заказе

    @Column(name = "countProduct", nullable = false)
    private Integer countProduct; // Кол-во товара в заказе

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClientOrder getClientOrder() {
        return clientOrder;
    }

    public void setClientOrder(ClientOrder clientOrder) {
        this.clientOrder = clientOrder;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getCountProduct() {
        return countProduct;
    }

    public void setCountProduct(Integer countProduct) {
        this.countProduct = countProduct;
    }
}
