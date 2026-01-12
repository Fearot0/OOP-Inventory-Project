package inventory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getId() {
        Product p = new Product(1, "Pen", 10.0, 5);
        assertEquals(1, p.getId());
    }

    @Test
    void getName() {
        Product p = new Product(1, "Pen", 10.0, 5);
        assertEquals("Pen", p.getName());
    }

    @Test
    void getPrice() {
        Product p = new Product(1, "Pen", 10.0, 5);
        assertEquals(10.0, p.getPrice());
    }

    @Test
    void getStockQuantity() {
        Product p = new Product(1, "Pen", 10.0, 5);
        assertEquals(5, p.getStockQuantity());
    }
}
