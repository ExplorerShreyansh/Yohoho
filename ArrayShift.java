import java.util.Scanner;

public class ArrayShift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Initialize the original array
        int[] originalArray = {1, 2, 3, 4, 5};

        System.out.print("Enter the number of elements you want to shift to the end of the array: ");
        int shiftCount = scan.nextInt(); // Number of elements to shift to the end of the array
        int[] shiftedArray = new int[originalArray.length];

        // Print the original array
        System.out.print("Original Array: ");
        for (int element : originalArray) {
            System.out.print(element + " ");
        }

        // Adjust shiftCount to ensure it is within the array's length
        if(shiftCount > originalArray.length){
            shiftCount = shiftCount % originalArray.length ;
        }

        // Create the shifted array
        for (int i = 0; i < originalArray.length; i++) {
            if (i < shiftCount) {
                shiftedArray[(originalArray.length-shiftCount)+i]=originalArray[i];
            }
            else {
                shiftedArray[i-shiftCount] = originalArray[i];
            }
        }

        // Print the shifted array
        System.out.print("\nShifted Array: ");
        for (int element : shiftedArray) {
            System.out.print(element + " ");
        }
    }
}