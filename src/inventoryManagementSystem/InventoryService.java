package inventoryManagementSystem;



	import java.util.HashMap;
	import java.util.Map;

	public class InventoryService {

	    private Map<Integer, Product> inventory;

	    public InventoryService() {

	        inventory = new HashMap<>();
	    }

	    // Add a new product
	    public void addProduct(Product product) {

	        int id = product.getProductId();

	        if (inventory.containsKey(id)) {

	            System.out.println("Product ID already exists");
	            return;
	        }

	        inventory.put(id, product);

	        System.out.println("Product added successfully");
	    }

	    // Search product by ID
	    public Product searchProduct(int id) {

	        return inventory.get(id);
	    }

	    // Update product price
	    public void updatePrice(int id, double price) {

	        Product product = searchProduct(id);

	        if (product == null) {

	            System.out.println("Product not found");
	            return;
	        }

	        product.updatePrice(price);

	        System.out.println("Product price updated successfully");
	    }

	    // Add stock
	    public void addStock(int id, int quantity) {

	        Product product = searchProduct(id);

	        if (product == null) {

	            System.out.println("Product not found");
	            return;
	        }

	        product.addStock(quantity);

	        System.out.println("Stock updated successfully");
	    }

	    // Sell product and add it to bill
	    public void sellProduct(int id, int quantity, Bill bill) {

	        Product product = searchProduct(id);

	        if (product == null) {

	            System.out.println("Product not found");
	            return;
	        }

	        bill.addItem(product, quantity);
	    }

	    // Display all products
	    public void displayProducts() {

	        if (inventory.isEmpty()) {

	            System.out.println("Inventory is empty");
	            return;
	        }

	        System.out.println("\n========== PRODUCT LIST ==========");

	        for (Product product : inventory.values()) {

	            System.out.println(product);
	            System.out.println("--------------------------------");
	        }
	    }

	    // Display products with stock below 5
	    public void displayLowStockProducts() {

	        boolean found = false;

	        System.out.println("\n========== LOW STOCK PRODUCTS ==========");

	        for (Product product : inventory.values()) {

	            if (product.getStock() < 5) {

	                System.out.println(product);
	                System.out.println("--------------------------------");
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("No low stock products available");
	        }
	    }

	    // Delete product
	    public void deleteProduct(int id) {

	        Product removed = inventory.remove(id);

	        if (removed != null) {

	            System.out.println("Product deleted successfully");

	        } else {

	            System.out.println("Product not found");
	        }
	    }
	}

