package ru.Denis.telegrambot.entities;

import javax.persistence.*;

@Entity
public class ClientOrder
{
    @Id
    @GeneratedValue
    private Long id; // Уникальный идентификатор

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client", nullable = false)
    private Client client; // Клиент сделавший заказ

    @Column(name = "status", nullable = false)
    private Integer status; // Статус заказа

    @Column(name = "total", nullable = false)
    private Double total; // Сумма по заказу

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
