package training12;


	class CarRentl {

	    // Rental for hours
	    void rentCar(int hrs) {
	        double amount = hrs * 200;
	        System.out.println("Rental for " + hrs + " hours");
	        System.out.println("Total Amount: Rs." + amount);
	    }

	    // Rental for days
	    void rentCar(boolean isDaily, int days) {
	        if (isDaily) {
	            double amount = days * 2000;
	            System.out.println("Rental for " + days + " days");
	            System.out.println("Total Amount: Rs." + amount);
	        } else {
	            System.out.println("Daily rental not selected");
	        }
	    }

	    // Rental for days with driver
	    void rentCar(int days, boolean isDriver) {
	        double amount = days * 2000;

	        if (isDriver) {
	            amount = amount + (days * 500);
	        }

	        System.out.println("Rental for " + days + " days");
	        System.out.println("Driver Required: " + isDriver);
	        System.out.println("Total Amount: Rs." + amount);
	    }
	}

	public class CarRental {
	    public static void main(String[] args) {

	        CarRentl c = new CarRentl();

	        c.rentCar(3);
	        System.out.println();

	        c.rentCar(true, 2);
	        System.out.println();

	        c.rentCar(2, true);
	    }
	}

