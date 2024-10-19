import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        
        // Initialize an ArrayList (Time complexity O(1))
        ArrayListString list = new ArrayListString();

        // Add an element at the end (Time complexity O(1))
        list.add("Final");
        list.add("Real final");
        
        // Add an element at any position (Time complexity O(n))
        list.add("Start", 0);
        list.add("Mid", 2);
        list.add("Full end", 10);

        // Accessing an element (Time complexity O(1))
        System.out.println(list.get(3));

        // Update an element (Time complexity O(1))
        list.update("New start", 0);

        // Delete last element of the array (Time complexity O(1))
        System.out.println("Last removed element was: " + list.delete());

        // Retrieve the array (Time complexity O(1))
        System.out.println(Arrays.toString(list.getArray()));
        
    }
}