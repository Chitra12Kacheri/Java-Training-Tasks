package movieTicketBooking;



import java.util.Scanner;

public class TicketCounter {

    private CinemaHall hall;
    private FareCalculator fare;
    private OfferManager offer;

    private int ticketNumber = 100;

    private String[] ticketIds = new String[25];
    private String[][] bookedSeats = new String[25][];
    private int bookingCount = 0;

    public TicketCounter(CinemaHall hall,
                         FareCalculator fare,
                         OfferManager offer) {

        this.hall = hall;
        this.fare = fare;
        this.offer = offer;
    }

    public void bookTickets(Scanner sc) {

        hall.displaySeats();

        System.out.print("\nHow many seats do you want? ");
        int count = sc.nextInt();

        if (count <= 0 || count > 25 - getBookedSeatCount()) {
            System.out.println("Invalid number of seats!");
            return;
        }

        String[] selectedSeats = new String[count];

        int[][] positions = new int[count][2];

        for (int i = 0; i < count; i++) {

            System.out.print("Enter seat " + (i + 1) + " (A1-E5): ");
            String seat = sc.next().toUpperCase();

            if (seat.length() != 2) {
                System.out.println("Invalid seat format!");
                return;
            }

            int row = seat.charAt(0) - 'A';
            int col = seat.charAt(1) - '1';

            if (row < 0 || row >= 5 ||
                col < 0 || col >= 5) {

                System.out.println("Invalid seat!");
                return;
            }

            if (!hall.isAvailable(row, col)) {
                System.out.println("Seat " + seat + " is already booked!");
                return;
            }

            for (int j = 0; j < i; j++) {

                if (selectedSeats[j].equals(seat)) {
                    System.out.println("Duplicate seat selected!");
                    return;
                }
            }

            selectedSeats[i] = seat;
            positions[i][0] = row;
            positions[i][1] = col;
        }

        System.out.print("Is it weekend? (yes/no): ");
        boolean weekend = sc.next().equalsIgnoreCase("yes");

        double amount = fare.calculateFare(count, weekend);

        System.out.print("Do you have a coupon? (yes/no): ");

        if (sc.next().equalsIgnoreCase("yes")) {

            System.out.print("Enter coupon code: ");
            String code = sc.next();

            amount = offer.applyOffer(code, amount);
        }

        for (int i = 0; i < count; i++) {
            hall.reserveSeat(positions[i][0], positions[i][1]);
        }

        String id = "CT" + (++ticketNumber);

        ticketIds[bookingCount] = id;
        bookedSeats[bookingCount] = selectedSeats.clone();

        bookingCount++;

        System.out.println("\n======= BOOKING CONFIRMED =======");
        System.out.println("Ticket ID: " + id);
        System.out.println("Number of seats: " + count);
        System.out.println("Selected seats: ");

        for (String seat : selectedSeats) {
            System.out.println(seat);
        }

        System.out.println("Final amount: Rs." + amount);
    }

    public void cancelBooking(Scanner sc) {

        System.out.print("Enter ticket ID: ");
        String id = sc.next().toUpperCase();

        for (int i = 0; i < bookingCount; i++) {

            if (ticketIds[i] != null &&
                ticketIds[i].equalsIgnoreCase(id)) {

                for (String seat : bookedSeats[i]) {

                    int row = seat.charAt(0) - 'A';
                    int col = seat.charAt(1) - '1';

                    hall.releaseSeat(row, col);
                }

                ticketIds[i] = null;
                bookedSeats[i] = null;

                System.out.println("Booking cancelled successfully!");
                return;
            }
        }

        System.out.println("Ticket ID not found!");
    }

    private int getBookedSeatCount() {

        int count = 0;

        for (int i = 0; i < bookingCount; i++) {

            if (bookedSeats[i] != null) {
                count += bookedSeats[i].length;
            }
        }

        return count;
    }
}


