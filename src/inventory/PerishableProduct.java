package inventory;

import java.time.LocalDate;  // LocalDate is a special class data type that  shows the exact date.


public class PerishableProduct extends Product {

    private LocalDate expiryDate;

    public PerishableProduct(int id, String name, double price, int stockQuantity, LocalDate expiryDate){
        super(id, name, price, stockQuantity);
        this.expiryDate = expiryDate;
    }


    public LocalDate getExpiryDate() {
        return expiryDate;
    }


    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }


}
