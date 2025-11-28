package inventory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
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


                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 0:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
