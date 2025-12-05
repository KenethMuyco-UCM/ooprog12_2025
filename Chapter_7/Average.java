public class Average {
    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        int count = 0;

        for (int i = 1; i < responseTimes.length; i++) {
            double sum = 0;

            // Sum of all previous elements
            for (int j = 0; j < i; j++) {
                sum += responseTimes[j];
            }

            double average = sum / i;

            if (responseTimes[i] > average) {
                count++;
            }
        }

        System.out.println(count);
    }
}
