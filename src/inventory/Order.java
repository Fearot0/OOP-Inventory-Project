package inventory;

import java.time.LocalDate;

public class Order {

    private int orderId;
    private Product product;
    private int quantity;
    private LocalDate orderDate;

    public Order(int orderId, Product product, int quantity, LocalDate orderDate) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }


    public int getOrderId() {
        return orderId;
    }


    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


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


    public LocalDate getOrderDate() {
        return orderDate;
    }


    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}
