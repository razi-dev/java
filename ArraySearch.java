import java.util.Scanner;

public class ArraySearch {

    // Method to search an element in the array
    public static boolean searchElement(int[] array, int target) {
        // Traverse through the array to search for the element
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;  // Element found
            }
        }
        return false;  // Element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Search the element and print the result
        if (searchElement(array, target)) {
            System.out.println("Element " + target + " found in the array.");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}

