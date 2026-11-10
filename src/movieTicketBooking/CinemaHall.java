package movieTicketBooking;



public class CinemaHall {

    private boolean[][] seats = new boolean[5][5];

    public void displaySeats() {

        System.out.println("\n======= CINEMA SEAT MAP =======");
        System.out.println("     1  2  3  4  5");

        for (int i = 0; i < seats.length; i++) {

            System.out.print((char)('A' + i) + "    ");

            for (int j = 0; j < seats[i].length; j++) {

                if (seats[i][j]) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" O ");
                }
            }

            System.out.println();
        }

        System.out.println("O - Available | X - Booked");
    }

    public boolean isAvailable(int row, int col) {

        return !seats[row][col];
    }

    public boolean reserveSeat(int row, int col) {

        if (row < 0 || row >= 5 || col < 0 || col >= 5) {
            return false;
        }

        if (seats[row][col]) {
            return false;
        }

        seats[row][col] = true;
        return true;
    }

    public void releaseSeat(int row, int col) {

        if (row >= 0 && row < 5 &&
            col >= 0 && col < 5) {

            seats[row][col] = false;
        }
    }
}


