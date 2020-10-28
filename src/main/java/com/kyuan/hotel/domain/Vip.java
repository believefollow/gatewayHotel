package com.kyuan.hotel.domain;


import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A Vip.
 */
@Entity
@Table(name = "vip")
public class Vip implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone")
    private String phone;

    @Column(name = "actived")
    private Boolean actived;

    @Column(name = "sign_in_date")
    private LocalDate signInDate;

    @OneToOne
    @JoinColumn(unique = true)
    private Customer customer;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public Vip phone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean isActived() {
        return actived;
    }

    public Vip actived(Boolean actived) {
        this.actived = actived;
        return this;
    }

    public void setActived(Boolean actived) {
        this.actived = actived;
    }

    public LocalDate getSignInDate() {
        return signInDate;
    }

    public Vip signInDate(LocalDate signInDate) {
        this.signInDate = signInDate;
        return this;
    }

    public void setSignInDate(LocalDate signInDate) {
        this.signInDate = signInDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vip customer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Vip)) {
            return false;
        }
        return id != null && id.equals(((Vip) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Vip{" +
            "id=" + getId() +
            ", phone='" + getPhone() + "'" +
            ", actived='" + isActived() + "'" +
            ", signInDate='" + getSignInDate() + "'" +
            "}";
    }
}
