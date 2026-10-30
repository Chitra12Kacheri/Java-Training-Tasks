package training12;



import java.util.Scanner;

class Resort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select room type:");
        System.out.println("1. Standard Room");
        System.out.println("2. Deluxe Room");
        System.out.print("Enter choice: ");
        int room = sc.nextInt();

        switch (room) {
            case 1:
                System.out.println("Standard Room selected");
                System.out.println("1. Single Bed - Rs. 1000");
                System.out.println("2. Double Bed - Rs. 1500");
                System.out.print("Choose bed type: ");
                int standard = sc.nextInt();

                switch (standard) {
                    case 1:
                        System.out.println("Single Bed booked. Rs. 1000");
                        break;
                    case 2:
                        System.out.println("Double Bed booked. Rs. 1500");
                        break;
                    default:
                        System.out.println("Invalid bed choice");
                }
                break;

            case 2:
                System.out.println("Deluxe Room selected");
                System.out.println("1. Single Bed - Rs. 2000");
                System.out.println("2. Double Bed - Rs. 2500");
                System.out.print("Choose bed type: ");
                int deluxe = sc.nextInt();

                switch (deluxe) {
                    case 1:
                        System.out.println("Deluxe Single Bed booked. Rs. 2000");
                        break;
                    case 2:
                        System.out.println("Deluxe Double Bed booked. Rs. 2500");
                        break;
                    default:
                        System.out.println("Invalid bed choice");
                }
                break;

            default:
                System.out.println("Invalid room choice");
        }

  
}


}
