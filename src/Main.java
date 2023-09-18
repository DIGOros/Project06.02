import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage of the methods
        int length = getUserInput("Enter the length of the array: ");
        int[] userArray = inputArray(length);
        printArray(userArray);

        int[] randomArray = createRandomArray(length);
        printArray(randomArray);

        int sum = sumArray(userArray);
        System.out.println("Sum of elements in userArray: " + sum);

        int largestValue = findLargestValue(randomArray);
        System.out.println("Largest value in randomArray: " + largestValue);

        int searchValue = getUserInput("Enter a value to search in userArray: ");
        int searchResult = searchValueInArray(userArray, searchValue);
        if (searchResult != -1) {
            System.out.println("Found at index: " + searchResult);
        } else {
            System.out.println("Value not found in userArray.");
        }

        scanner.close();
    }

    // Method for user input of array elements
    public static int[] inputArray(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    // Method for creating an array with random values
    public static int[] createRandomArray(int length) {
        Random random = new Random();
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = random.nextInt(100); // Generates random values between 0 and 99
        }
        return newArray;
    }

    // Method for printing an array
    public static void printArray(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method for calculating the sum of array elements
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Method for finding the largest value in an array
    public static int findLargestValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Method for searching a value in an array
    public static int searchValueInArray(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1; // Value not found
    }

    // Method to get user input
    public static int getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
