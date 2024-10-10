import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {
        // Create a TreeSet of doubles
        TreeSet<Double> numberSet = new TreeSet<>();

        // Add values to the set
        numberSet.add(1.1);
        numberSet.add(2.2);
        numberSet.add(3.3);
        numberSet.add(4.4);
        numberSet.add(5.5);

        // Print the TreeSet
        System.out.println("TreeSet: " + numberSet);

        // Use first() to get the first element
        Double first = numberSet.first();
        System.out.println("First element: " + first);

        // Use last() to get the last element
        Double last = numberSet.last();
        System.out.println("Last element: " + last);

        // Use higher() to get the smallest element strictly greater than 3.3
        Double higherThan3_3 = numberSet.higher(3.3);
        System.out.println("Element higher than 3.3: " + higherThan3_3);

        // Use lower() to get the largest element strictly less than 3.3
        Double lowerThan3_3 = numberSet.lower(3.3);
        System.out.println("Element lower than 3.3: " + lowerThan3_3);
    }
}
