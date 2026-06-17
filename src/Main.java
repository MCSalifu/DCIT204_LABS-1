import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] array = new int[size];

        while (true) {

            for (int i = 0; i < size; i++) {

                System.out.print("Enter element " + (i + 1) + ": ");
                array[i] = input.nextInt();

            }

            if (Algorithm.ascend(array) || Algorithm.descend(array)) {
                break;
            }

            System.out.println("\nInput must be sorted. Please enter the values again.\n");

        }

        System.out.print("\nEnter target value: ");
        int target = input.nextInt();

        int linearResult = Algorithm.linearSearch(array, target);

        int binaryResult = Algorithm.binarySearch(array, target);

        System.out.println("\nLinear Search Result:");

        if (linearResult != -1) {
            System.out.println("Target found at index " + linearResult);
        } else {
            System.out.println("Target not found");
        }

        System.out.println("\nBinary Search Result:");

        if (binaryResult != -1) {
            System.out.println("Target found at index " + binaryResult);
        } else {
            System.out.println("Target not found");
        }

        input.close();

    }

}
