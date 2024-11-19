import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to rotate to the left of the array: ");
        int rotateCount = scan.nextInt(); // Number of positions to rotate the array

        // Initializing the array
        int[] array = {1, 2, 3, 4, 5};

        // Printing the original array
        System.out.print("Original Array: ");
        for(int element : array) {
            System.out.print(element + " ");
        }

        // Rotating the array to the left by rotateCount positions
        for(int i = 0; i < rotateCount; i++) {

            // Store the first element to move it to the end after shifting
            int firstElement = array[0];

            // Shift all elements one position to the left
            for(int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }

            // Place the first element at the last position
            array[array.length - 1] = firstElement;
        }

        // Printing the rotated array
        System.out.println();
        System.out.print("Rotated Array: ");
        for(int element : array) {
            System.out.print(element + " ");
        }
    }
}