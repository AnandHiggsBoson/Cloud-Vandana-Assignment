import java.util.Random;

public class ArrayShuffle {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original Array:");
        printArray(originalArray);

        shuffleArray(originalArray);

        System.out.println("\nShuffle Array:");
        printArray(originalArray);
    }

    private static void shuffleArray(int[] array) {
        Random rand = new Random();

        // Start from the last element and swap one by one
        for (int i = array.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i
            int randomIndex = rand.nextInt(i + 1);

            // Swap array[i] with the element at randomIndex
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
