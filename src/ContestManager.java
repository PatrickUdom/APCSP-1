// class Location {
//     private int rowNumber;
//     private int colNumber;
 
//     /** Create a new Location.
//      * @param row the row number
//      * @param col the column number
//      */
//     Location(int row, int col) {
//         rowNumber = row;
//         colNumber = col;
//     }
 
//     /** @return the row number of this Location */
//     int getRowNumber() {
//         return rowNumber;
//     }
 
//     /** @return the column number of this Location */
//     int getColNumber() {
//         return colNumber;
//     }
 
//     public String toString() {
//         return "(" + rowNumber + ", " + colNumber + ")";
//     }
// }
 
// class Contestant {
//     private String name;
//     private int score;
//     private Location loc;
 
//     Contestant(String name, int score, int row, int col) {
//         this.name = name;
//         this.score = score;
//         this.loc = new Location(row, col);
//     }
 
//     /** @return the name of this contestant */
//     String getName() {
//         return name;
//     }
 
//     /** @return the score of this contestant */
//     int getScore() {
//         return score;
//     }
 
//     /** @return the location of this contestant */
//     Location getLocation() {
//         return loc;
//     }
 
//     /** Changes the location of this contestant to a new row and column.
//      * @param newRow the new row
//      * @param newCol the new column
//      */
//     void updateLocation(int newRow, int newCol) {
//         loc = new Location(newRow, newCol);
//     }
// }
 
// class ContestOrganizer {
//     /** the number of rows of contestants */
//     static final int NUM_ROWS = 2; // Example: 2 rows
//     static final int CONTESTANTS_PER_ROW = 3; // Example: 3 contestants per row
 
//     /** The two-dimensional array of contestants */
//     private Contestant[][] contestants;
 
//     /** Constructor to initialize the 2D array based on constants */
//     ContestOrganizer() {
//         contestants = new Contestant[NUM_ROWS][CONTESTANTS_PER_ROW];
//     }
 
//     /** Dynamically update the rows and columns based on the constants */
//     void updateRows() {
//         for (int row = 0; row < NUM_ROWS; row++) {
//             for (int col = 0; col < CONTESTANTS_PER_ROW; col++) {
//                 contestants[row][col] = new Contestant(
//                     "Contestant " + (row * CONTESTANTS_PER_ROW + col + 1),
//                     (int) (Math.random() * 200), row, col);
//             }
//         }
//     }
 
//     /** Sorts arr in increasing order by score using Bubble Sort */
//     private void sort(Contestant[] arr) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j].getScore() > arr[j + 1].getScore()) {
//                     // Swap elements
//                     Contestant temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }
 
//     /** Sorts each row of contestants into increasing order by score. */
//     void sortAllRows() {
//         for (int i = 0; i < NUM_ROWS; i++) {
//             sort(contestants[i]);
//         }
//     }
 
//     /** Returns name of contestant with highest score. */
//     String findWinnerName() {
//         String winnerName = "";
//         int highestScore = Integer.MIN_VALUE;
 
//         for (int row = 0; row < NUM_ROWS; row++) {
//             for (int col = 0; col < CONTESTANTS_PER_ROW; col++) {
//                 if (contestants[row][col].getScore() > highestScore) {
//                     highestScore = contestants[row][col].getScore();
//                     winnerName = contestants[row][col].getName();
//                 }
//             }
//         }
//         return winnerName;
//     }
 
//     /** Prints the contestants in the array */
//     void printContestants() {
//         for (int row = 0; row < NUM_ROWS; row++) {
//             for (int col = 0; col < CONTESTANTS_PER_ROW; col++) {
//                 System.out.print(
//                     contestants[row][col].getName() + "(" + contestants[row][col].getScore() + ") ");
//             }
//             System.out.println();
//         }
//     }
// }
 
// public class ContestManager {
//     public static void main(String[] args) {
//         ContestOrganizer organizer = new ContestOrganizer();
 
//         // Initialize and update rows based on final constants
//         organizer.updateRows();
 
//         // Print initial contestants
//         System.out.println("Initial Contestants:");
//         organizer.printContestants();
 
//         // Sort rows by score
//         System.out.println("\nSorting Rows...");
//         organizer.sortAllRows();
 
//         // Print sorted contestants
//         System.out.println("Sorted Contestants:");
//         organizer.printContestants();
 
//         // Find and display the winner
//         String winnerName = organizer.findWinnerName();
//         System.out.println("\nWinner: " + winnerName);
//     }
// }