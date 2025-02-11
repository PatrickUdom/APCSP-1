import java.util.ArrayList;

public class P1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
 
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
 
        System.out.println("Fruits: " + fruits); // Output: Fruits: [Apple, Banana, Orange]
 
        fruits.add(1, "Grape"); // Insert "Grape" at index 1
        System.out.println("Fruits after insertion: " + fruits); // Output: Fruits after insertion: [Apple, Grape, Banana, Orange]
 
 
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit); // Output: First fruit: Apple
 
        fruits.remove("Banana");
        System.out.println("Fruits after removal: " + fruits); // Output: Fruits after removal: [Apple, Grape, Orange]
 
        System.out.println("Size of fruits list:" + fruits.size()); // Output: Size of fruits list: 3
 
        for (String fruit : fruits){
            System.out.println(fruit);
        }
 
        fruits.clear();
        System.out.println("Fruits after clearing: " + fruits); // Output: Fruits after clearing: []
    }
}