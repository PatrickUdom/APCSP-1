import java.util.Random;

public class SnowyOwl extends Owl {
     public SnowyOwl(String owlName) {
          super("Snowy Owl");
     }

     @Override
     public String getFood() {
          String [] foodList = {"hare", "lemming", "small bird"};
          int foodPosition = new Random().nextInt(foodList.length);
          return foodList[foodPosition];
     }
}

// A SnowyOwl is an Owl whose name is always "Snowy owl". A SnowyOwl will
// randomly eat a hare, a lemming, or a small bird (depending on what’s available!), where each type of food is equally likely. The SnowyOwl class should
// use a random number to determine which food the SnowyOwl will eat. Assuming that the Owl class has been correctly defined, and given the class hierarchy shown previously, write a complete declaration of the class SnowyOwl,
// including implementation of its constructor and method(s).