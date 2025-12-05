import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 100.00; // Starting balance
        final double INTEREST_RATE = 0.03;
        int year = 1;
        int choice;

        do {
            balance += balance * INTEREST_RATE;
            System.out.printf("After year %d at %.2f interest rate, balance is $%.2f%n",
                              year, INTEREST_RATE, balance);
            year++;

            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
        } while (choice == 1);

        input.close();
    }
}
