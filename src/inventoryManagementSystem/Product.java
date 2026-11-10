package inventoryManagementSystem;



	public class Product {

	    private int productId;
	    private String productName;
	    private Category category;
	    private double price;
	    private int stock;

	    // Constructor
	    public Product(int productId, String productName,
	                   Category category, double price, int stock) {

	        if (productId <= 0) {
	            throw new IllegalArgumentException("Invalid Product ID");
	        }

	        if (productName == null || productName.trim().isEmpty()) {
	            throw new IllegalArgumentException("Product name cannot be empty");
	        }

	        if (price <= 0 || stock < 0) {
	            throw new IllegalArgumentException("Invalid price or stock");
	        }

	        this.productId = productId;
	        this.productName = productName;
	        this.category = category;
	        this.price = price;
	        this.stock = stock;
	    }

	    // Getter methods
	    public int getProductId() {
	        return productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public Category getCategory() {
	        return category;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getStock() {
	        return stock;
	    }

	    // Update product price
	    public void updatePrice(double newPrice) {

	        if (newPrice <= 0) {
	            throw new IllegalArgumentException(
	                    "Price must be greater than zero");
	        }

	        this.price = newPrice;
	    }

	    // Add stock
	    public void addStock(int quantity) {

	        if (quantity <= 0) {
	            throw new IllegalArgumentException(
	                    "Stock quantity must be positive");
	        }

	        stock = stock + quantity;
	    }

	    // Sell product
	    public void sellProduct(int quantity) {

	        if (quantity <= 0) {
	            throw new IllegalArgumentException(
	                    "Selling quantity must be positive");
	        }

	        if (stock == 0) {
	            throw new IllegalStateException(
	                    "Product is out of stock");
	        }

	        if (quantity > stock) {
	            throw new IllegalStateException(
	                    "Insufficient stock. Available stock: " + stock);
	        }

	        stock = stock - quantity;
	    }

	    // Display product details
	    @Override
	    public String toString() {

	        return "Product ID: " + productId +
	                "\nProduct Name: " + productName +
	                "\nCategory: " + category +
	                "\nPrice: Rs." + price +
	                "\nAvailable Stock: " + stock;
	    }
	}

