package inventory;

import java.time.LocalDate;

public class StockManager {
    private Inventory inventory;

    public StockManager(Inventory inventory) {
        this.inventory = inventory;
    }


    public void addNewProduct(int id, String name, double price,int stockQuantity){
        Product product = new Product(id, name, price, stockQuantity);
        inventory.addProduct(product);
        System.out.println("New product added by stockManager:" + product.getName());
    }


    public void addNewPerishableProduct(int id, String name, double price,int stockQuantity, LocalDate expiryDate){

        PerishableProduct product = new PerishableProduct(id, name, price, stockQuantity, expiryDate);
        inventory.addProduct(product);
        System.out.println("New perishable product added by stockManager:" + product.getName() + "(expiryDate:" + product.getExpiryDate() + ")");
    }


    public void removeProduct(int id){
        boolean removed = inventory.removeProductById(id);
        if (removed){
            System.out.println("Product removed from stockManager. ID:" + id);
        }
        else{
            System.out.println("Product not removed from stockManager. ID:" + id);
        }
    }


    public void changeStock(int id, int newStock){
        boolean uptaded = inventory.updateStock(id, newStock);
        if (uptaded){
            System.out.println("Stock has been changed from stockManager. ID:" + id);
        }
        else {
            System.out.println("Cannot update stock. Product not found. ID:" + id);
        }
    }


    public void showLowStock(int limit){
        inventory.printLowStockProducts(limit);
    }




}
