import java.util.PriorityQueue;

public class QUe2 {
      public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add integers to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(4);

        // Print the PriorityQueue (the internal ordering might not be as expected)
        System.out.println("PriorityQueue: " + priorityQueue);

        // Use peek() to get the head of the queue
        System.out.println("Head of the queue (using peek): " + priorityQueue.peek());

        // Remove the head of the queue using poll()
        priorityQueue.poll();

        // Print the PriorityQueue after removing the head
        System.out.println("PriorityQueue after removing the head: " + priorityQueue);
    }
}
