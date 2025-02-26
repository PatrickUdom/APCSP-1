public class BirdSanctuary {

/** The list of birds */

    private Bird[] birdList;

/** Precondition: Each Bird in birdList has a getFood
* method implemented for it.
* Postcondition: For each Bird in the birdList array, its name
* followed by the result of a call to its getFood
* method has been printed, one line per Bird.
*/

public void allEat() {
    int numBirds = birdList.length; 
    for (int i = 0; i < numBirds; i++) {
        System.out.print(birdList[i].getName());
        System.out.print(birdList[i].getFood());
        }
    }
}
