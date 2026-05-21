public class Q1{
    public static void main(String[] args) {
        // 1. Declaration and Initialization
        int[] numbers = {10, 20, 30, 40, 50};
        // 2. Accessing elements (Index starts at 0)
        System.out.println("First element: " + numbers[0]);

        // 3. Modifying an element
        numbers[2] = 100; // Changes 30 to 100

        // 4. Looping through the array using a standard for-loop
        System.out.println("Array elements using for-loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // 5. Using an enhanced for-each loop (cleaner syntax)
        System.out.println("\nUsing for-each loop:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}