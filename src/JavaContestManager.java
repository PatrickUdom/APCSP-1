class Location {
    private int rowNumber;
    private int colNumber;

    public Location (int row, int col){
        this.rowNumber = row;
        this.colNumber = col;
    }

    public int getRowNumber(){
        return rowNumber;
    }

    public int getColNumber(){
        return colNumber;
    }

    public String toString(){
        String rowString = String.valueOf(rowNumber);
        String colString = String.valueOf(colNumber);
        return "(" + rowString + ", " + colString + ")";
    }
}

class Contestant {
    private String name;
    private int score;
    private Location loc;

    Contestant(String name, int score, int row, int col) {
        this.name = name;
        this.score = score;
        this.loc = new Location(row, col);
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public Location getLocation(){
        return loc;
    }

    public void updateLocation(int newRow, int newCol){
        loc = new Location(newRow, newCol);
    }
}

class ApcsaFirst {
    public static final int NUM_ROWS = 2;
    public static final int CONTESTANTS_PER_ROW = 3;
    private Contestant[][] contestants;

    public ContestOrganizer(){
        contestants = new Contestant[NUM_ROWS][CONTESTANTS_PER_ROW];
    }

    private void sort(Contestant[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j].getScore() < arr[i].getScore()) {
                    Contestant temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void sortAllRows(){ 
        for (int row = 0; row < NUM_ROWS; row++) {
            sort(contestants[row]);
        }
    }

    public String findWinnerName(Contestant[] arr){
        int currentMax = 0;
        String currentWinner = "";
        for (int i = 0; i < NUM_ROWS; i++) {
            if (currentMax < arr[CONTESTANTS_PER_ROW - 1].getScore()){
                currentMax = arr[CONTESTANTS_PER_ROW - 1].getScore();
                currentWinner = arr[CONTESTANTS_PER_ROW - 1].getName();
            }
        }
        return currentWinner; 
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

public class JavaContestManager {
    public static void main(String[] args) {
        ContestOrganizer organizer = new ContestOrganizer();
 
        // Initialize and update rows based on final constants
        organizer.updateRows();
 
        // Print initial contestants
        System.out.println("Initial Contestants:");
        organizer.printContestants();
 
        // Sort rows by score
        System.out.println("\nSorting Rows...");
        organizer.sortAllRows();
 
        // Print sorted contestants
        System.out.println("Sorted Contestants:");
        organizer.printContestants();
 
        // Find and display the winner
        String winnerName = organizer.findWinnerName();
        System.out.println("\nWinner: " + winnerName);
    }
}