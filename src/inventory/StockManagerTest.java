package inventory;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StockManagerTest {

    @Test
    void addNewProduct() {
        Inventory inventory = new Inventory();
        StockManager manager = new StockManager(inventory);

        manager.addNewProduct(1, "Pen", 10.0, 5);

        assertNotNull(inventory.findProductById(1));
        assertEquals("Pen", inventory.findProductById(1).getName());
    }

    @Test
    void addNewPerishableProduct() {
        Inventory inventory = new Inventory();
        StockManager manager = new StockManager(inventory);
        LocalDate expiry = LocalDate.of(2026, 1, 1);

        manager.addNewPerishableProduct(2, "Milk", 5.0, 10, expiry);

        Product p = inventory.findProductById(2);
        assertNotNull(p);
        assertTrue(p instanceof PerishableProduct);
        assertEquals(expiry, ((PerishableProduct) p).getExpiryDate());
    }

    @Test
    void removeProduct() {
        Inventory inventory = new Inventory();
        StockManager manager = new StockManager(inventory);

        manager.addNewProduct(3, "Book", 20.0, 4);
        manager.removeProduct(3);

        assertNull(inventory.findProductById(3));
    }

    @Test
    void changeStock() {
        Inventory inventory = new Inventory();
        StockManager manager = new StockManager(inventory);

        manager.addNewProduct(4, "Pencil", 2.0, 10);
        manager.changeStock(4, 3);

        assertEquals(3, inventory.findProductById(4).getStockQuantity());
    }
}
