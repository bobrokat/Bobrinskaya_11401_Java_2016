package com.itis.bobrinskaya.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Ekaterina on 29.04.2016.
 */
@Entity
@SequenceGenerator(sequenceName = "order_id_seq", name = "order_gen", allocationSize = 1)
public class Orders {
    private int id;
    private String address;
    private Users user;
    private boolean status;
    private Double price;
    private Collection<Productinorder> productinorderList = new ArrayList<>();
    private String note;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_gen")
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "address", nullable = false, insertable = true, updatable = true, length = 150)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "orderByOrderId")
    public Collection<Productinorder> getProductinorderList() {
        return productinorderList;
    }
    public void setProductinorderList(Collection<Productinorder> productinorderList) {
        this.productinorderList = productinorderList;
    }





//    @Basic
//    @Column(name = "user_id", nullable = false, insertable = true, updatable = true)
//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }



    @Basic
    @Column(name = "status", nullable = false, insertable = true, updatable = true)
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orders orders = (Orders) o;

        if (id != orders.id) return false;
        if (user != orders.user) return false;
        if (status != orders.status) return false;
        if (address != null ? !address.equals(orders.address) : orders.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + user.hashCode();
        result = 31 * result + (status ? 1 : 0);
        return result;
    }

    @Basic
    @Column(name = "price", nullable = true, insertable = true, updatable = true, precision = 17)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "note", nullable = true, insertable = true, updatable = true, length = 150)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
