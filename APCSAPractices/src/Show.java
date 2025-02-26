public class Show {

    /** The seats for this show */

    private int[][] seats;
    private final int SEATS_PER_ROW = <some integer value>;
    private final int NUM_ROWS = <some integer value>;

    /** Returns true if the seat with the specified row and seat
    * number is an aisle seat, false otherwise.
    * @param row the row number
    * @param seatNumber the seat number
    * @return true if an aisle seat, false otherwise
    */

    public boolean isAisleSeat (int row, int seatNumber) {
        if (seats[row][seatNumber] == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    // return (seats[row][seatNumber] == 1)

    /** Reserve two adjacent seats and return true if this was
    * successfully done.
    * If two adjacent seats could not be found, leave the state
    * of the show unchanged, and return false.
    * @return true if two adjacent seats were found, false
    * otherwise
    */

    public boolean twoTogether() {
        for (int i = 0; i < SEATS_PER_ROW; i++) {
            for (int k = 0; k < NUM_ROWS-1; k++) {
                if (isAisleSeat(i, k) && (isAisleSeat(i, k+1))) {
                        return true;
                }
            }
        }
        return false;
    }

    /** Return the lowest seat number in the specified row for a
    * block of empty adjacent seats. If no such block exists,
    * return -1.
    * @param row the row number
    * @param seatsNeeded the number of adjacent empty seats needed
    * @return lowest seat number for a block of needed adjacent
    * seats or -1 if no such block exists
    */

    // public int findAdjacent(int row, int seatsNeeded) {
    //     int adjacentSeat = 0;
    //     for (int i = 0; i < SEATS_PER_ROW; i++) {
    //         int availableSeats = SEATS_PER_ROW - i;
    //         if (isAisleSeat(row, i)) {
    //             if (seatsNeeded <= availableSeats) {
    //                 for (int j = 1; j < seatsNeeded; j++) {
    //                     if (isAisleSeat(row, i+j));
    //                     adjacentSeat = i;
    //                 }
    //             }
    //         }
    //     }
    //     return adjacentSeat;
    // }

    public int findAdjacent(int row, int seatsNeeded) {
        int adjacentSeat = 0;
        int availableSeats = 0;
        for (int i = 0; i < SEATS_PER_ROW; i++) {
            if (isAisleSeat(row, i)) {
            availableSeats += 1;
            }
            else {
            availableSeats = 0;
            }

            if (availableSeats == seatsNeeded) {
                adjacentSeat = i;
                break;
            }
            else {
                adjacentSeat = -1;
            }
        }
        return adjacentSeat;
    }
}

// loop until seat is free
// when seat is free, create variable and add 1 to itself for each available seat
// if the next seat is unavailable then the variable becomes 0
// when the variable reach the number of seats needed then it ends

// [ 1, 0, 1, 0, 0]
// [ 0, 0, 1, 0, 0]

// availableSeats = 0
// SeatsNeeded = 2
// i = 0

// findAdjacent(1,2)
