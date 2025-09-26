import java.util.Scanner;

public class DebugFour4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a destination >> ");
        String dest1 = input.nextLine();

        System.out.print("Enter a destination >> ");
        String dest2 = input.nextLine();
        System.out.print("Enter a departure city >> ");
        String dep2 = input.nextLine();

        System.out.print("Enter a destination >> ");
        String dest3 = input.nextLine();
        System.out.print("Enter a departure city >> ");
        String dep3 = input.nextLine();
        System.out.print("Enter mode of transportation >> ");
        String mode3 = input.nextLine();

        Trip trip1 = new DebugTrip(dest1);
        Trip trip2 = new DebugTrip(dest2, dep2);
        Trip trip3 = new DebugTrip(dest3, dep3, mode3);

        System.out.println("\nTrip 1: to " + trip1.getDestination() +
                           " from " + trip1.getDepartureCity() +
                           " by " + trip1.getMode());

        System.out.println("Trip 2: to " + trip2.getDestination() +
                           " from " + trip2.getDepartureCity() +
                           " by " + trip2.getMode());

        System.out.println("Trip 3: to " + trip3.getDestination() +
                           " from " + trip3.getDepartureCity() +
                           " by " + trip3.getMode());
    }
}
