package training12;


	class Product {
	    int productId;
	    String productName;
	    double price;

	    Product(int productId, String productName, double price) {
	        this.productId = productId;
	        this.productName = productName;
	        this.price = price;
	    }

	    void display() {
	        System.out.println("Product ID: " + productId);
	        System.out.println("Product Name: " + productName);
	        System.out.println("Price: " + price);
	    }
	}

	class Electronics extends Product {
	    int warranty;

	    Electronics(int id, String name, double price, int warranty) {
	        super(id, name, price);
	        this.warranty = warranty;
	    }

	    void display() {
	        super.display();
	        System.out.println("Warranty: " + warranty + " years");
	    }
	}

	class Clothing extends Product {
	    String size;

	    Clothing(int id, String name, double price, String size) {
	        super(id, name, price);
	        this.size = size;
	    }

	    void display() {
	        super.display();
	        System.out.println("Size: " + size);
	    }
	}

	class Food extends Product {
	    String expiryDate;

	    Food(int id, String name, double price, String expiryDate) {
	        super(id, name, price);
	        this.expiryDate = expiryDate;
	    }

	    void display() {
	        super.display();
	        System.out.println("Expiry Date: " + expiryDate);
	    }
	}

	public class OnlineShopping {
	public static void main(String[] args) {

	        Electronics e = new Electronics(101, "Laptop", 50000, 2);
	        Clothing c = new Clothing(102, "T-Shirt", 799, "L");
	        Food f = new Food(103, "Biscuits", 50, "30-12-2026");

	        System.out.println("Electronics Details:");
	        e.display();

	        System.out.println("\nClothing Details:");
	        c.display();

	        System.out.println("\nFood Details:");
	        f.display();
	    }
	}

