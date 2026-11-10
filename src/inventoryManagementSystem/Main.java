package inventoryManagementSystem;



	import java.util.Scanner;

	public class Main {

	    static Scanner sc = new Scanner(System.in);

	    static InventoryService service = new InventoryService();

	    static Bill bill = new Bill();

	    public static void main(String[] args) {

	        int choice;

	        do {

	            System.out.println("\n================================");
	            System.out.println("     INVENTORY MANAGEMENT");
	            System.out.println("================================");

	            System.out.println("1. Add Product");
	            System.out.println("2. Search Product");
	            System.out.println("3. Update Product Price");
	            System.out.println("4. Add Stock");
	            System.out.println("5. Sell Product");
	            System.out.println("6. Display All Products");
	            System.out.println("7. Display Low Stock Products");
	            System.out.println("8. Display Customer Bill");
	            System.out.println("9. Delete Product");
	            System.out.println("10. Exit");

	            System.out.print("\nEnter your choice: ");

	            try {

	                choice = sc.nextInt();

	                switch (choice) {

	                    case 1:
	                        addProduct();
	                        break;

	                    case 2:
	                        searchProduct();
	                        break;

	                    case 3:
	                        updatePrice();
	                        break;

	                    case 4:
	                        addStock();
	                        break;

	                    case 5:
	                        sellProduct();
	                        break;

	                    case 6:
	                        service.displayProducts();
	                        break;

	                    case 7:
	                        service.displayLowStockProducts();
	                        break;

	                    case 8:
	                        bill.displayBill();
	                        break;

	                    case 9:
	                        deleteProduct();
	                        break;

	                    case 10:
	                        System.out.println("Thank you for using Inventory System");
	                        break;

	                    default:
	                        System.out.println("Invalid choice");
	                }

	            } catch (java.util.InputMismatchException e) {

	                System.out.println("Please enter valid numeric input");
	                sc.nextLine();
	                choice = 0;

	            } catch (IllegalArgumentException |
	                     IllegalStateException e) {

	                System.out.println("Error: " + e.getMessage());
	                choice = 0;
	            }

	        } while (choice != 10);

	        sc.close();
	    }

	    // Add product
	    public static void addProduct() {

	        System.out.print("Enter Product ID: ");
	        int id = sc.nextInt();

	        sc.nextLine();

	        System.out.print("Enter Product Name: ");
	        String name = sc.nextLine();

	        System.out.println("\nSelect Category:");

	        Category[] categories = Category.values();

	        for (int i = 0; i < categories.length; i++) {

	            System.out.println((i + 1) + ". " + categories[i]);
	        }

	        System.out.print("Enter category number: ");
	        int categoryChoice = sc.nextInt();

	        if (categoryChoice < 1 ||
	                categoryChoice > categories.length) {

	            throw new IllegalArgumentException("Invalid category");
	        }

	        Category category = categories[categoryChoice - 1];

	        System.out.print("Enter Price: ");
	        double price = sc.nextDouble();

	        System.out.print("Enter Stock Quantity: ");
	        int stock = sc.nextInt();

	        Product product = new Product(
	                id, name, category, price, stock);

	        service.addProduct(product);
	    }

	    // Search product
	    public static void searchProduct() {

	        System.out.print("Enter Product ID: ");

	        int id = sc.nextInt();

	        Product product = service.searchProduct(id);

	        if (product != null) {

	            System.out.println("\nProduct Found:");
	            System.out.println(product);

	        } else {

	            System.out.println("Product not found");
	        }
	    }

	    // Update price
	    public static void updatePrice() {

	        System.out.print("Enter Product ID: ");
	        int id = sc.nextInt();

	        System.out.print("Enter New Price: ");
	        double price = sc.nextDouble();

	        service.updatePrice(id, price);
	    }

	    // Add stock
	    public static void addStock() {

	        System.out.print("Enter Product ID: ");
	        int id = sc.nextInt();

	        System.out.print("Enter Quantity: ");
	        int quantity = sc.nextInt();

	        service.addStock(id, quantity);
	    }

	    // Sell product
	    public static void sellProduct() {

	        System.out.print("Enter Product ID: ");
	        int id = sc.nextInt();

	        System.out.print("Enter Quantity: ");
	        int quantity = sc.nextInt();

	        service.sellProduct(id, quantity, bill);
	    }

	    // Delete product
	    public static void deleteProduct() {

	        System.out.print("Enter Product ID: ");

	        int id = sc.nextInt();

	        service.deleteProduct(id);
	    }
	}

