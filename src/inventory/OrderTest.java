package inventory;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void getOrderId() {
        Product p = new Product(1, "Pen", 10.0, 5);
        Order order = new Order(101, p, 2, LocalDate.now());

        assertEquals(101, order.getOrderId());
    }

    @Test
    void getProduct() {
        Product p = new Product(2, "Book", 20.0, 3);
        Order order = new Order(102, p, 1, LocalDate.now());

        assertEquals("Book", order.getProduct().getName());
    }

    @Test
    void getQuantity() {
        Product p = new Product(3, "Notebook", 15.0, 4);
        Order order = new Order(103, p, 3, LocalDate.now());

        assertEquals(3, order.getQuantity());
    }

    @Test
    void getOrderDate() {
        LocalDate today = LocalDate.now();
        Product p = new Product(4, "Pencil", 1.5, 20);
        Order order = new Order(104, p, 5, today);

        assertEquals(today, order.getOrderDate());
    }
}
