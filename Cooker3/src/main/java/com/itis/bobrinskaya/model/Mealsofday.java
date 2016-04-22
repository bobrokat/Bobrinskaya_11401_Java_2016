package com.itis.bobrinskaya.model;

import javax.persistence.*;

/**
 * Created by Ekaterina on 18.04.2016.
 */
@Entity
public class Mealsofday {
    private int id;
    private Product product;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    @SequenceGenerator(sequenceName = "mealsofday_id_seq", name = "meals_gen", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meals_gen")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToOne
    @JoinColumn(name = "prod_id")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mealsofday that = (Mealsofday) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
