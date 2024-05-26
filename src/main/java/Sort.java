import java.util.Arrays;

/**
 * This class implements multiple sort algorithms.
 *
 * @author Hieu Nguyen
 * @version (CSSSKL 143)
 */

public class Sort {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] bubbleArray = new int[SIZE];
        int[] selectionArray = new int[SIZE];
        int[] insertionArray = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            bubbleArray[i] = (int) (Math.random() * 52);
            selectionArray[i] = (int) (Math.random() * 52);
            insertionArray[i] = (int) (Math.random() * 52);
        }

        System.out.println("Array before bubble sort:");
        System.out.println(Arrays.toString(bubbleArray));
        bubbleSort(bubbleArray);
        System.out.println("Array after bubble sort:");
        System.out.println(Arrays.toString(bubbleArray));
        System.out.println();

//        System.out.println("Array before selection sort:");
//        System.out.println(Arrays.toString(selectionArray));
//        selectionSort(selectionArray);
//        System.out.println("Array after selection sort:");
//        System.out.println(Arrays.toString(selectionArray));
//        System.out.println();
//
//        System.out.println("Array before insertion sort:");
//        System.out.println(Arrays.toString(insertionArray));
//        insertionSort(insertionArray);
//        System.out.println("Array after insertion sort:");
//        System.out.println(Arrays.toString(insertionArray));

        // TODO Test your string sort here
    }

    /**
     *
     * @param numbers
     */
    public static void bubbleSort(int[] numbers) {
        boolean swapped;
        for(int i = 0; i < numbers.length; i++){
            swapped = false;
            for(int j = 0; j < numbers.length - i - 1; j++){
                if(numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }
    }

    public static void bubbleSort(String[] strings) {
        boolean swapped;
        for(int i = 0; i < strings.length; i++){
            swapped = false;
            for(int j = 0; j < strings.length - i - 1; j++){
                if(strings[j].compareTo(strings[j + 1]) > 0) {
                    swap(strings, j, j + 1);
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }
    }

    /**
     *
     *
     * @param numbers
     * @param indexA
     * @param indexB
     */
    public static void swap(int[] numbers, int indexA, int indexB) {
        int temp = numbers[indexA];
        numbers[indexA] = numbers[indexB];
        numbers[indexB] = temp;
    }

    public static void swap(String[] numbers, int indexA, int indexB) {
        String temp = numbers[indexA];
        numbers[indexA] = numbers[indexB];
        numbers[indexB] = temp;
    }

    // selection sort for ints
    public static void selectionSort(int[] numbers) {
        for(int i = 0; i < numbers.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[j] < numbers[minIndex]){
                    minIndex = j;
                }
            }
            swap(numbers, i, minIndex);
        }
    }

    public static int findSmallest(int[] arr, int begin, int end) {
        int minIndex = begin;
        int minValue = arr[begin];
        for (int i = begin + 1; i < end; i++) {
            if (arr[i] < minValue) {
                minIndex = i;
                minValue = arr[i];
            }
        }
        return minIndex;
    }

    /**
     *
     * @param numbers
     */
    public static void insertionSort(int[] numbers) {
        for(int i = 1; i < numbers.length; i++){
            int j = i - 1;
            int comparable = numbers[i];
            while(j >= 0 && numbers[j] > comparable){
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = comparable;
        }
    }
}
