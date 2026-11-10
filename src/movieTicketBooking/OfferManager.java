package movieTicketBooking;



public class OfferManager {

    public double applyOffer(String coupon, double amount) {

        if (coupon.equalsIgnoreCase("CINE10")) {

            double discount = amount * 0.10;

            System.out.println("Discount received: Rs." + discount);

            return amount - discount;
        }

        System.out.println("Invalid coupon. No discount applied.");

        return amount;
    }
}


