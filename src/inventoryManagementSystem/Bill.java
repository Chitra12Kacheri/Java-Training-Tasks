package inventoryManagementSystem;



	import java.util.ArrayList;
	import java.util.List;

	public class Bill {

	    private List<String> billItems;
	    private double totalAmount;

	    public Bill() {

	        billItems = new ArrayList<>();
	        totalAmount = 0;
	    }

	    // Add product to bill
	    public void addItem(Product product, int quantity) {

	        if (product == null) {
	            throw new IllegalArgumentException("Invalid product");
	        }

	        // Reduce stock
	        product.sellProduct(quantity);

	        // Calculate item amount
	        double itemAmount = product.getPrice() * quantity;

	        totalAmount = totalAmount + itemAmount;

	        String item = product.getProductName() +
	                " | Quantity: " + quantity +
	                " | Amount: Rs." + itemAmount;

	        billItems.add(item);

	        System.out.println("Product added to bill successfully");
	    }

	    // Display complete bill
	    public void displayBill() {

	        System.out.println("\n========== CUSTOMER BILL ==========");

	        if (billItems.isEmpty()) {
	            System.out.println("No products purchased");
	            return;
	        }

	        for (String item : billItems) {
	            System.out.println(item);
	        }

	        System.out.println("-----------------------------------");
	        System.out.println("Grand Total: Rs." + totalAmount);
	        System.out.println("===================================");
	    }

	    public double getTotalAmount() {

	        return totalAmount;
	    }
	}
