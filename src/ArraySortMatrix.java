// Problem: Sort Array, start with 2x2

public class ArraySortMatrix {
    public static void main(String[] args) {
        int[] arrayUnsorted = {4, 2, 1, 3};
        System.out.println("Unsorted Array:");
        printArray(arrayUnsorted);
        insertionSort(arrayUnsorted);
        System.out.println("Sorted Matrix:");
        createMatrix(arrayUnsorted);
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int sortedIndex = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > sortedIndex) {
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = sortedIndex;
            }
        }

    public static void createMatrix(int[] array) {
        int [][] matrixArray = {
            {array[0],array[1]},
            {array[2],array[3]}};
        print2D(matrixArray);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void print2D(int mat[][])
    {
        for (int i = 0; i < mat.length; i++)

            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
    }
}