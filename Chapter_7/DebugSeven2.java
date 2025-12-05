import java.util.*;

public class DebugSeven2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a series of integers separated by spaces >> ");
        String str = in.nextLine();

        String[] parts = str.trim().split("\\s+"); // handles multiple spaces
        int sum = 0;

        for (String part : parts) {
            if (!part.isEmpty()) { // skip empty strings
                int num = Integer.parseInt(part);
                System.out.println(" " + num);
                sum += num;
            }
        }

        System.out.println("-------------------");
        System.out.println("The sum of the integers is " + sum);

        in.close();
    }
}
