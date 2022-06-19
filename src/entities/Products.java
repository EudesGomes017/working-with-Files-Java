package entities;

import java.io.Serializable;

public class Products implements Serializable {
    private  static  final long serialVersionUID = 1l;

    private String name;
    private Double price;
    private Integer quantity;

    public Products() {

    }

    public Products(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    //metodo para calcular o preço e a quantidade
    public double total() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}




