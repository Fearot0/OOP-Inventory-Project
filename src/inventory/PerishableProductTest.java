package inventory;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PerishableProductTest {

    @Test
    void getExpiryDate() {
        LocalDate expiry = LocalDate.of(2026, 1, 1);

        PerishableProduct p = new PerishableProduct(
                1,
                "Milk",
                5.0,
                10,
                expiry
        );

        assertEquals(expiry, p.getExpiryDate());
    }
}
