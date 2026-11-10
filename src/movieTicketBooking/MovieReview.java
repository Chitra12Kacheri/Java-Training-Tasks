package movieTicketBooking;


public class MovieReview {

    private double totalRating;
    private int totalReviews;

    public void addRating(double rating) {

        if (rating < 1 || rating > 5) {
            System.out.println("Rating must be between 1 and 5.");
            return;
        }

        totalRating += rating;
        totalReviews++;

        System.out.println("Thank you for your rating!");
    }

    public void showAverageRating() {

        if (totalReviews == 0) {
            System.out.println("No ratings available yet.");
        } else {

            double average = totalRating / totalReviews;

            System.out.println("Average movie rating: " + average);
        }
    }
}


