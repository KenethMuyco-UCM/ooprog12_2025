import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Predefined string
        String predefined = "Carmen";

        // User input
        System.out.print("Enter your name = ");
        String userInput = input.nextLine();

        // Strict comparison using equals()
        if (predefined.equals(userInput)) {
            System.out.println(predefined + " equals " + userInput);
        } else {
            System.out.println(predefined + " does not equal " + userInput);
        }

        input.close();
    }
}
