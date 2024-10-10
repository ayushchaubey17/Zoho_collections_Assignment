import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Que1 {
    public static void main(String[] args) {
        // Create a Queue using LinkedList and add strings to it
        Queue<String> fruitQueue = new LinkedList<>();

        // Add elements to the Queue
        fruitQueue.add("apple");
        fruitQueue.add("banana");
        fruitQueue.add("cherry");
        fruitQueue.add("date");

        // Print the Queue
        System.out.println("Queue: " + fruitQueue);

        // Iterate through the Queue using an Iterator
        System.out.println("Iterating through the Queue using an Iterator:");
        Iterator<String> iterator = fruitQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
