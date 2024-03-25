import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        Random rand = new Random();

        // Initializing dataPoints with random values between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        // Displaying dataPoints values
        System.out.print("DataPoints: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Calculating sum and average
        int sum = 0;
        for (int val : dataPoints) {
            sum += val;
        }
        double average = (double) sum / dataPoints.length;

        // Outputting sum and average
        System.out.printf("The sum of the random array dataPoints is: %d\n", sum);
        System.out.printf("The average of the random array dataPoints is: %.2f\n", average);
    }

}