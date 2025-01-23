public class array {
    public static void sumArray(int [][] arr2D) {
        int sum = 0;
        int rows = arr2D.length;
        for (int i = 0; i < rows; i++) {
            int column = arr2D[i].length;
            for (int k = 0; k < column; k++) {
                sum += arr2D[i][k];
            }
        }
    System.out.println(sum);
    }
    
    public static void main(String[] args) {
        int [][] arr2D = {
            {1,2,3},
            {4,5,6},
            {7,8,9}};
        sumArray(arr2D);
    }
}