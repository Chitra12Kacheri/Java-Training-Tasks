package movieTicketBooking;



public class FareCalculator {

    public double calculateFare(int numberOfSeats, boolean weekend) {

        double price = weekend ? 250 : 200;

        return price * numberOfSeats;
    }
}


