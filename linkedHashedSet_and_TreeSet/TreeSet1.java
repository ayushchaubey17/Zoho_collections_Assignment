import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numberSet = new TreeSet<>();

        // Add numbers to the set
        numberSet.add(50);
        numberSet.add(30);
        numberSet.add(20);
        numberSet.add(10);
        numberSet.add(40);

        // Print the elements of the set
        System.out.println("Elements in the TreeSet: " + numberSet);
    }
}
