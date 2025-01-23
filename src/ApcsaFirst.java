public class ApcsaFirst {
    
}

public class Location {
    private int rowNumber;
    private int colNumber;

    public Location (int row, int col){
        rowNumber = row;
        colNumber = col;
    }

    public int getRowNumber(){
        return rowNumber();
    }

    public int getColNumber(){
        return colNumber;
    }

    public String toString(){
    }
}

public class Contestant {

    private String name;
    private int score;
    private Location loc;

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

public class ContestOrganizer {
    public static final int NUM_ROWS = 2;
    public static final int CONTESTANTS_PER_ROW = 3;
    private Contestant [][] contestants;

    public ContestOrganizer(){
        contestants = new Contestant[NUM_ROWS][CONTESTANTS_PER_ROW];
    }

    private void sort(Contestant[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.getScore[j] < arr.getScore[i]) {
                    int temp = arr.getScore[i];
                    arr.getScore[i] = arr.getScore[j];
                    arr.getScore[j] = temp;
                    printArray(arr);
                }
            }
        }
    }

    public void sortAllRows(){ 
        for (int row = 0; row < NUM_ROWS; row++) {
            sort(contestants[row]);
        }
    }

    public String findWinnerName(){

    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

