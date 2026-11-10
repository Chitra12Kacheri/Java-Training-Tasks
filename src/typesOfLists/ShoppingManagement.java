package typesOfLists;



import java.util.*;

public class ShoppingManagement {
    public static void main(String[] args) {

        // 1. ArrayList - Shopping Cart
        ArrayList<String> cart = new ArrayList<>();

        cart.add("Laptop");
        cart.add("Mobile");
        cart.add("Headphones");
        cart.add("Keyboard");

        System.out.println("----- SHOPPING CART -----");
        System.out.println(cart);

        cart.add(1, "Smart Watch");
        cart.set(2, "iPhone");
        cart.remove("Keyboard");

        System.out.println("Updated Cart: " + cart);
        System.out.println("Cart Size: " + cart.size());
        System.out.println("Contains Laptop: " 
                + cart.contains("Laptop"));


        // 2. LinkedList - Recently Viewed Products
        LinkedList<String> recentProducts = new LinkedList<>();

        recentProducts.add("Camera");
        recentProducts.add("Tablet");
        recentProducts.add("Smart TV");

        // Adding at first and last positions
        recentProducts.addFirst("Laptop");
        recentProducts.addLast("Mobile");

        System.out.println("\n----- RECENTLY VIEWED -----");
        System.out.println(recentProducts);

        // Accessing first and last elements
        System.out.println("First Product: " 
                + recentProducts.getFirst());

        System.out.println("Last Product: " 
                + recentProducts.getLast());

        // Removing first product
        recentProducts.removeFirst();

        System.out.println("After Removing First: " 
                + recentProducts);


        // 3. Vector - Product Inventory
        Vector<String> inventory = new Vector<>();

        inventory.add("Laptop");
        inventory.add("Mobile");
        inventory.add("Mouse");
        inventory.add("Printer");

        System.out.println("\n----- PRODUCT INVENTORY -----");
        System.out.println(inventory);

        // Adding multiple products
        inventory.addAll(Arrays.asList("Monitor", "Keyboard"));

        // Checking capacity
        System.out.println("Vector Capacity: " 
                + inventory.capacity());

        // Accessing an element
        System.out.println("Product at index 2: " 
                + inventory.get(2));

        // Removing a product
        inventory.remove("Printer");

        System.out.println("Updated Inventory: " + inventory);

        // Iterating through inventory
        System.out.println("Available Products:");

        for (String product : inventory) {
            System.out.println(product);
        }
    }
}


