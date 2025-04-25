import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) { // Check if the element matches the target
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array
        int[] arr = {10, 20, 30, 40, 50};

        // Display the array
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Taking user input for the target element
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Perform linear search
        int index = linearSearch(arr, target);

        // Display result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close(); // Close scanner
    }
}

