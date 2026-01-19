package inventory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        inventory.loadFromFile();
        StockManager manager = new StockManager(inventory);

        while (true) {
            System.out.println("\n===== INVENTORY MENU =====");
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. Update stock");
            System.out.println("4. Search product");
            System.out.println("5. Show low stock");
            System.out.println("6. Show all products");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter product id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();


                    System.out.println("Enter product name: ");
                    String name = scanner.nextLine();


                    System.out.println("Enter product price: ");
                    double price = scanner.nextDouble();


                    System.out.println("Enter stock quantity: ");
                    int stock =scanner.nextInt();

                    manager.addNewProduct(id,name,price,stock);



                    break;

                case 2:
                    System.out.print("Enter product id to remove: ");
                    int removeId = scanner.nextInt();

                    manager.removeProduct(removeId);


                    break;

                case 3:

                    System.out.print("Enter product id: ");
                    int uptadeId = scanner.nextInt();

                    System.out.print("Enter new stock quantity:");
                    int newStock = scanner.nextInt();

                    manager.changeStock(uptadeId,newStock);
                    break;

                case 4:

                    System.out.print("Enter product id to search: ");
                    int searchId = scanner.nextInt();

                    Product found = inventory.findProductById(searchId);

                    if (found != null){
                        System.out.println("Product Found:");
                        System.out.println("ID: " + found.getId());
                        System.out.println("Name: " + found.getName());
                        System.out.println("Price: " + found.getPrice());
                        System.out.println("Stock Quantity: " + found.getStockQuantity());

                    }

                    else {
                        System.out.println("Product Not Found");
                    }

                    break;

                case 5:

                    System.out.print("Enter stock limit:  ");
                    int limit = scanner.nextInt();

                    inventory.printLowStockProducts(limit);
                    break;

                case 6:
                    inventory.displayAllProducts();
                    break;
                    

                case 0:
                    inventory.saveToFile();
                    System.out.println("Products saved. Exiting program...");

                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
