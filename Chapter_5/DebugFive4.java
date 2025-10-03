import java.util.*;

class DebugFive4 {
    public static void main(String args[]) {
        int one, two, three, four;
        int highest;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer >> ");
        one = input.nextInt();
        System.out.print("Enter an integer >> ");
        two = input.nextInt();
        System.out.print("Enter an integer >> ");
        three = input.nextInt();
        System.out.print("Enter an integer >> ");
        four = input.nextInt();

        // Start assuming first number is highest
        highest = one;

        if (two > highest)
            highest = two;
        if (three > highest)
            highest = three;
        if (four > highest)
            highest = four;

        System.out.println("The highest number is " + highest);
    }
}
