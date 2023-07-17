package ru.Denis.telegrambot.entities;

import javax.persistence.*;

@Entity
public class Client
{
    @Id
    @GeneratedValue
    private Long id; // Уникальный идентификатор

    @Column(name = "externalId", nullable = false, unique = true)
    private Long externalId; // Внешний уникальный идентификатор

    @Column(name = "fullName", nullable = false) // ФИО
    private String fullName;

    @Column(name = "phoneNumber", nullable = false) // Номер телефона
    private String phoneNumber;

    @Column(name = "address", nullable = false) // Адрес
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExternalId() {
        return externalId;
    }

    public void setExternalId(Long externalId) {
        this.externalId = externalId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
