 import java.util.Random;
import java.util.Scanner;
public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        // 1. Declare an array of type int named dataPoints.
        int[] dataPoints = new int[100];

        // 1b. Initialize each element in dataPoints to a random value between 1 and 100.
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // 1c. Display the dataPoints values
        System.out.print("DataPoints: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i != dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // 1d. Calculate sum + average
        int sum = 0;
        for (int num : dataPoints) {
            sum += num;
        }
        double average = (double) sum / dataPoints.length;

        // 1d. Display sum and average
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        //Program  2. Linear scan //
        Scanner scanner = new Scanner(System.in);

        // 2a. Prompt user value between 1 - 100
        int userValue = SafeInput.getRangedInt(scanner, "Enter a value between 1 and 100:", 1, 100);

        // 2b. Count  userValue
        int count = 0;
        for (int num : dataPoints) {
            if (num == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " appears " + count + " times in the dataPoints array.");

        // 2c. Find position of userValue
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("The value " + userValue + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + userValue + " was not found in the dataPoints array.");
        }

        // 2d. Find minimum, maximum values
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("Minimum value in dataPoints: " + min);
        System.out.println("Maximum value in dataPoints: " + max);

        // 2e. Calculate and display average
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    // Static method to calculate average
    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}
