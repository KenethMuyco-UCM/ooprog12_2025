import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double initialBalance = input.nextDouble();

        double[] rates = {0.02, 0.03, 0.04, 0.05};

        for (int i = 0; i < rates.length; i++) {
            double rate = rates[i];
            double currentBalance = initialBalance;

            System.out.printf("%nWith an initial balance of $%.2f%n", initialBalance);

            for (int year = 1; year <= 4; year++) {
                currentBalance = currentBalance * (1 + rate);

                System.out.printf(
                    "After year %d balance is $%.2f with an interest rate of %.2f%n",
                    year, currentBalance, rate
                );
            }
        }

        System.out.println("\n==> End of program. Operation complete");

        input.close();
    }
}
