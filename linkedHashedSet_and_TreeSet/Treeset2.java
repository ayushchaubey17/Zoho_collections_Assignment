import java.util.TreeSet;
import java.util.Comparator;

public class TreeSet2 {
    public static void main(String[] args) {
        // Create a TreeSet with a custom comparator to sort strings by length
        TreeSet<String> stringSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Compare based on the length of the strings
                int lengthCompare = Integer.compare(s1.length(), s2.length());
                // If lengths are the same, use natural alphabetical order to avoid duplicates
                return lengthCompare != 0 ? lengthCompare : s1.compareTo(s2);
            }
        });

        // Add strings to the set
        stringSet.add("banana");
        stringSet.add("apple");
        stringSet.add("cherry");
        stringSet.add("date");

        // Print the elements of the set
        System.out.println("Elements in the TreeSet (ordered by length): " + stringSet);
    }
}
