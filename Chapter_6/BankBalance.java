import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        final double INTEREST_RATE = 0.03;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        int year = 1;
        while (true) {
            System.out.print("How many years to see next year's balance?\nEnter 1 for one year or any other number for no >> ");
            int choice = input.nextInt();
            if (choice != 1) break;

            balance += balance * INTEREST_RATE;
            System.out.printf("After year %d at %.2f interest rate, balance is $%.2f%n", year, INTEREST_RATE, balance);
            year++;

            System.out.print("Do you want to see the next year?\nEnter 1 for yes or any other number for no >> ");
            int next = input.nextInt();
            if (next != 1) break;
        }

        input.close();
    }
}
