public class SortInsertion1 {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(array);

        insertionSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int sortedIndex = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > sortedIndex; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = sortedIndex;
            printArray(array);
            }
        }
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}