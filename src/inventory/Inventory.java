package inventory;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> products;


    public Inventory(){
        products = new ArrayList<>();
    }


    public void addProduct(Product product){
        products.add(product);

    }


    public Product findProductById(int id){
        for(Product p : products){
            if (p.getId() == id){
                return p;
            }

        }
        return null;
    }


    public boolean removeProductById(int id){
        Product p = findProductById(id);
        if(p != null){
            products.remove(p);
            return true;
        }
        return false;
    }


    public boolean uptadeStock(int id, int newStock){
        Product p = findProductById(id);
        if (p != null){
            p.setStockQuantity(newStock);
            return true;
        }
        return false;
    }


    public void printLowStockProducts(int limit){
        System.out.println("Low stock products ( <= " + limit + "):");
        for (Product p : products){
            if (p.getStockQuantity() <= limit){
                System.out.println(
                        "ID: " + p.getId() + "Name: " + p.getName() + "Stock: " + p.getStockQuantity()
                );

            }
        }
    }



}
