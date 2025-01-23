public class ArrayProblem {
    public static void main(String[] args){
        int [][] matrixArray = {
            {1,2,3},
            {4,5,6},
            {7,8,9}};
        System.out.println("This is the sum of each rows:");
        matrix.sumRows(matrixArray);
        System.out.println("This is the sum of each columns:");
        matrix.sumColumns(matrixArray);
    }
}

class matrix {
    public static void mainDiagonal(int [][] matrixArray) {
        int rows = matrixArray.length;
        for (int i = 0; i < rows; i++) {
            System.out.println(matrixArray[i][i]);
            } 
        }

    public static void antiDiagonal(int [][] matrixArray) {
        int rows = matrixArray.length;
        for (int i = 0; i < rows; i++) {
            int columns = matrixArray[i].length;
            System.out.println(matrixArray[i][columns - (i+1)]); 
            }
        }

    public static void sumRows(int [][] matrixArray) {
        int rows = matrixArray.length;
        for (int i = 0 ; i < rows ; i++) {
            int sum = 0;
            int columns = matrixArray[i].length;
            for (int k = 0; k < columns; k++) {
                sum += matrixArray[i][k];
            }
            System.out.println(sum);
        }
    }

    public static void sumColumns(int [][] matrixArray) {
        int columns = matrixArray[0].length;
        for (int i = 0; i < columns; i++) {
            int sum = 0;
            int rows = matrixArray.length;
            for (int k = 0; k < rows; k++) {
                sum += matrixArray[k][i];
            }
            System.out.println(sum);
        }
    }
}
// Problem 3: Search for a Specific Element
// Return the position of the element if found.