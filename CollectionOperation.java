import java.util.ArrayList;
import java.util.List;
public class CollectionOperation {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana");
        System.out.println("List: " + fruits);
        fruits.remove("Banana"); // removes first occurrence
        // System.out.println("After removing Banana: " + fruits);
        // System.out.println("Contains Mango? " +fruits.contains("Mango"));
    }
}
