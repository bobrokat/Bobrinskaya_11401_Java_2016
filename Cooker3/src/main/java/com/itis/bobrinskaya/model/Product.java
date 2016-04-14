package com.itis.bobrinskaya.model;


import javax.persistence.*;

/**
 * Created by Ekaterina on 12.04.2016.
 */
@Entity
@Table(name = "product")
public class Product {
    @Id
    private Long id;
    private String name;
    private String description;
    private String type;
    private String photo;
    private String price;


    @Basic
    @Column(name = "description", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "photo", nullable = false, insertable = true, updatable = true, length = 150)
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "price", nullable = false, insertable = true, updatable = true, length = 50)
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "type", nullable = false, insertable = true, updatable = true, length = 50)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!id.equals(product.id)) return false;
        if (!name.equals(product.name)) return false;
        if (!description.equals(product.description)) return false;
        if (!type.equals(product.type)) return false;
        if (!photo.equals(product.photo)) return false;
        return price.equals(product.price);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + photo.hashCode();
        result = 31 * result + price.hashCode();
        return result;
    }
}
