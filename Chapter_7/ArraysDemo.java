import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = new int[5]; 
        display("Original array:", numbers);

        Arrays.fill(numbers, 8); 
        display("After filling with 8s:", numbers);

        numbers[1] = 6;
        numbers[2] = 6;
        numbers[4] = 3;
        display("After changing two values:", numbers);

        Arrays.sort(numbers); 
        display("After sorting:", numbers);
    }

    public static void display(String message, int[] array) {
        System.out.print(message + "  ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
