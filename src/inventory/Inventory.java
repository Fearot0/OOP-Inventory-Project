package inventory;

import java.io.*;

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


    public boolean updateStock(int id, int newStock){
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
                        "ID: " + p.getId() + " | Name: " + p.getName() + " | Stock: " + p.getStockQuantity()

                );

            }
        }
    }


    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }

        System.out.println("All products in inventory:");

        for (Product p : products) {
            System.out.println(
                    "ID: " + p.getId() +
                            " Name: " + p.getName() +
                            " Price: " + p.getPrice() +
                            " Stock: " + p.getStockQuantity()
            );
        }
    }


    public void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("products.txt"))) {
            for (Product p : products) {
                writer.println(
                        p.getId() + "," +
                                p.getName() + "," +
                                p.getPrice() + "," +
                                p.getStockQuantity()
                );
            }
        } catch (IOException e) {
            System.out.println("Error saving products.");
        }
    }

    public void loadFromFile() {
        File file = new File("products.txt");
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Product p = new Product(
                        Integer.parseInt(data[0]),
                        data[1],
                        Double.parseDouble(data[2]),
                        Integer.parseInt(data[3])
                );
                products.add(p);
            }
        } catch (IOException e) {
            System.out.println("Error loading products.");
        }
    }




}
