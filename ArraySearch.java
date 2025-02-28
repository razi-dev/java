import java.util.Scanner;

public class ArraySearch {

    public static boolean searchElement(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true; 
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

    
        if (searchElement(array, target)) {
            System.out.println("Element " + target + " found in the array.");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}

