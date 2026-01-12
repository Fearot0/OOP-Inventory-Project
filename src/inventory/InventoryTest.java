package inventory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    @Test
    void addProduct() {
        Inventory inventory = new Inventory();
        Product p = new Product(1, "Pen", 10.0, 5);

        inventory.addProduct(p);

        assertEquals(p, inventory.findProductById(1));
    }

    @Test
    void findProductById() {
        Inventory inventory = new Inventory();
        Product p = new Product(2, "Book", 20.0, 3);

        inventory.addProduct(p);

        assertNotNull(inventory.findProductById(2));
        assertEquals("Book", inventory.findProductById(2).getName());
    }

    @Test
    void removeProductById() {
        Inventory inventory = new Inventory();
        Product p = new Product(3, "Eraser", 2.0, 10);

        inventory.addProduct(p);

        assertTrue(inventory.removeProductById(3));
        assertNull(inventory.findProductById(3));
    }

    @Test
    void updateStock() {
        Inventory inventory = new Inventory();
        Product p = new Product(4, "Pencil", 1.5, 20);

        inventory.addProduct(p);

        assertTrue(inventory.updateStock(4, 7));
        assertEquals(7, inventory.findProductById(4).getStockQuantity());
    }
}
