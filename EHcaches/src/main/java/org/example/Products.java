package org.example;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;
import javax.persistence.*;

@Entity
@Table(name="Products123")
@Cacheable
@Cache(usage= CacheConcurrencyStrategy.READ_ONLY)
public class Products {
    @Id
    @Column(name="product_id")
    private int product_id;
    @Column(name="product_name")
    private String product_name;
    @Column(name="price")
    private int price;
    public int getProduct_id() {
        return product_id;
    }
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


}

