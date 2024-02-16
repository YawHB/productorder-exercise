package kea.exercises.productorderexercise.models;

import jakarta.persistence.*;
import org.aspectj.weaver.ast.Or;

@Entity
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Product product;
    private int quantity;



    //****************** CONSTRUCTOR ******************//
public OrderLine() {

}

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    //****************** GETTERS & SETTERS ******************//
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
