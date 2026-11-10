package movieTicketBooking;



import java.util.Scanner;

public class CinemaApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CinemaHall hall = new CinemaHall();

        FareCalculator fare = new FareCalculator();

        OfferManager offer = new OfferManager();

        MovieReview review = new MovieReview();

        TicketCounter counter =
            new TicketCounter(hall, fare, offer);

        int choice;

        do {

            System.out.println("\n===== CINEMAGIC =====");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book Tickets");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Give Movie Rating");
            System.out.println("5. View Average Rating");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    hall.displaySeats();
                    break;

                case 2:
                    counter.bookTickets(sc);
                    break;

                case 3:
                    counter.cancelBooking(sc);
                    break;

                case 4:

                    System.out.print("Enter rating (1-5): ");

                    double rating = sc.nextDouble();

                    review.addRating(rating);
                    break;

                case 5:
                    review.showAverageRating();
                    break;

                case 6:
                    System.out.println("Thank you for visiting CineMagic!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 6);

        sc.close();
    }
}


